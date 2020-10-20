const section = document.getElementById("cards");
const card = document.getElementById("card");

const bacterias = [
    {
        id: 1,
        nome:"bacteria 1",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 2,
        nome:"bacteria 2",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 3,
        nome:"bacteria 3",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 4,
        nome:"bacteria 4",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 5,
        nome:"bacteria 5",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 6,
        nome:"bacteria 6",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 7,
        nome:"bacteria 7",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 8,
        nome:"bacteria 8",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 9,
        nome:"bacteria 9",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 10,
        nome:"bacteria 10",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 11,
        nome:"bacteria 11",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    },
    {
        id: 12,
        nome:"bacteria 12",
        tipo: "tipo 1",
        genero: "genero 1",
        familia: "grupo 1",
        info: "descrição bacteria 1",
        imagem: "images/pokemon.png"
    }
];

function listarBacterias(){

/*bacterias.map(bacteria => {
    const cardClone = card.cloneNode(true);
    cardClone.setAttribute("num", bacteria.id);
    cardClone.querySelector(".img").src = bacteria.imagem; 
    cardClone.querySelector(".id").innerHTML = bacteria.id;
    cardClone.querySelector(".nome").innerHTML = bacteria.nome;
    cardClone.querySelector(".tipo").innerHTML = bacteria.tipo;
    section.appendChild(cardClone);
});
card.remove();*/
}


var id = 0;



function mostraBacteria(){
    id++;
    var nome = document.getElementsByTagName("span")[0];
    console.log(nome);
    var tipo = document.getElementsByTagName("span")[1];
    var genero = document.getElementsByTagName("span")[2];
    var familia = document.getElementsByTagName("span")[3];
    var info = document.querySelector("#caracteristicas p");

    nome.innerHTML = bacterias[id].nome;
    tipo.innerHTML = bacterias[id].tipo;
    genero.innerHTML = bacterias[id].genero;
    familia.innerHTML = bacterias[id].grupo;
    info.innerHTML = bacterias[id].info;
    
    document.querySelector("#bacteria .img img").src = bacterias[id].imagem;
    
}