const API = "http://localhost:8080/voluntarios";

function cadastrar() {
  fetch(API, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({
      nome: nome.value,
      email: email.value,
      telefone: telefone.value
    })
  }).then(() => listar());
}

function listar() {
  fetch(API)
    .then(r => r.json())
    .then(dados => {
      lista.innerHTML = "";
      dados.forEach(v => {
        lista.innerHTML += `
          <li>
            ${v.nome} - ${v.email}
            <button onclick="deletar(${v.id})">X</button>
          </li>`;
      });
    });
}

function deletar(id) {
  fetch(`${API}/${id}`, { method: "DELETE" })
    .then(() => listar());
}
listar();
