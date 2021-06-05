import { Produtos } from "./Produtos"

export class Categoria {

    public id: number
    public nome: string
    public descricao: string
    public modelo: string
    public material: string
    public produto: Produtos[]
}