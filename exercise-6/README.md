# Exercise No 6

 Create a method on LaptopController that receives a Laptop object (JSON) from Postman and persists it to the database.


## API Reference

#### Get all list items

```http
  GET /api/laptop/getList
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Add new item

```http
  POST /api/laptop/add
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_body` | `JSON` | **Required**. Your API body |


## Tech Stack 
  [Spring](https://spring.io)
