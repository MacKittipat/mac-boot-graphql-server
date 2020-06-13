# mac-boot-grapql

http://localhost:8080/graphiql

```

mutation {
  createAuthor(firstName:"Mac", lastName:"Java") {
    id,
    firstName,
    lastName
  }
}

{
  findAuthorById(id:1) {
    id,
    firstName,
    lastName
  }
}

{
  findAllAuthor {
    id,
    firstName,
    lastName
  }
}

mutation {
  createBook(title:"Hello World", price:10.00, authorId:2) {
    id,
    title,
    author {
      id
    }
  }
}

{
    findBookById(id: 3) {
    id,
    title,
    price,
    author {
      firstName,
      lastName
    }
  }
}

{
  findAllBook {
    title,
    author {
      firstName,
      lastName
    }
  }
}

```
