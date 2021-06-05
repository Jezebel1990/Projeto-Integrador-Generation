import { Produtos } from "./Produtos"

export class User {

    public id: number
    public nomeCompleto:  string
    public email: string
    public senha: string
    public telefoneFixo: string
    public telefoneCelular: string
    public endereco: string
    public produto: Produtos[]
}