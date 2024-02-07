# TeamRocket-Pj

```mermaid
erDiagram
    USERS ||--o{ SIGNS : has
    SIGNS ||--o{ HOROSCOPES : has
    USERS {
        int id
        string name
        date birthdate
    }
    SIGNS {
        int id
        string name
        string element
        string modality
    }
    HOROSCOPES {
        int id
        string content
        date date
    }
```
