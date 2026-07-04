# EntryPoint 🔐

A secure, scalable personal journal REST API built with Spring Boot 4 and Java 17.

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=pragyagupta23_EntryPoint&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=pragyagupta23_EntryPoint)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=pragyagupta23_EntryPoint&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=pragyagupta23_EntryPoint)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=pragyagupta23_EntryPoint&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=pragyagupta23_EntryPoint)

---

## 🚀 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Core language |
| Spring Boot 4.0.6 | Application framework |
| Spring Security 6 + JWT | Authentication & authorization |
| MongoDB Atlas | Primary database |
| Redis | Caching layer |
| Apache Kafka | Async messaging & sentiment analysis |
| Google OAuth2 | Social login |
| SonarCloud | Code quality analysis |
| GitHub Actions | CI/CD pipeline |

---

## ✨ Features

- **JWT Authentication** — Stateless token-based login system
- **Role-Based Access Control** — Separate USER and ADMIN roles
- **Journal Management** — Full CRUD for personal journal entries
- **Weather Greeting** — Real-time weather data on user login
- **Sentiment Analysis** — Weekly sentiment analysis via Kafka messaging
- **Redis Caching** — Optimized performance with cache layer
- **Google OAuth2** — Sign in with Google support
- **Email Notifications** — Automated email alerts via Gmail SMTP
- **Code Quality** — SonarCloud integration with Grade A ratings
- **CI/CD Pipeline** — Automated build and analysis via GitHub Actions

---

## 📁 Project Structure
src/main/java/com/pragyagupta/entrypoint/
├── controller/        # REST API endpoints
├── service/           # Business logic layer
├── repository/        # MongoDB data access layer
├── entity/            # Database models
├── filter/            # JWT authentication filter
├── config/            # Spring Security configuration
├── scheduler/         # Scheduled tasks
├── cache/             # Redis cache configuration
├── dto/               # Data transfer objects
├── model/             # Kafka message models
├── enums/             # Application enumerations
└── utilis/            # Utility classes

---

## 🔌 API Endpoints

### Public
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/public/createUser` | Register new user |
| POST | `/public/login` | Login and get JWT token |

### User (Requires Authentication)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/user` | Get greeting with weather |
| PUT | `/user` | Update user details |
| DELETE | `/user` | Delete account |

### Journal (Requires Authentication)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/journal` | Get all journal entries |
| POST | `/journal` | Create new entry |
| GET | `/journal/id/{id}` | Get entry by ID |
| PUT | `/journal/id/{id}` | Update entry |
| DELETE | `/journal/id/{id}` | Delete entry |

### Admin (Requires ADMIN Role)
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/admin/all-users` | Get all users |

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17
- Maven
- MongoDB Atlas account
- Redis Cloud account

### Environment Variables
Set the following environment variables before running:
MONGODB_URI=your_mongodb_connection_string
REDIS_HOST=your_redis_host
REDIS_PASSWORD=your_redis_password
WEATHER_API_KEY=your_weather_api_key
JAVA_EMAIL=your_gmail_address
JAVA_EMAIL_PASSWORD=your_gmail_app_password
KAFKA_SERVERS=your_kafka_bootstrap_servers
KAFKA_JAAS_CONFIG=your_kafka_jaas_config
GOOGLE_CLIENT_ID=your_google_client_id
GOOGLE_CLIENT_SECRET=your_google_client_secret
SERVER_PORT=8080

### Run the Application
```bash
# Clone the repository
git clone https://github.com/pragyagupta23/EntryPoint.git

# Navigate to project directory
cd EntryPoint

# Build the project
mvn clean install -DskipTests

# Run the application
mvn spring-boot:run
```

API will be available at `http://localhost:8080`

---

## 🔒 Authentication

EntryPoint uses JWT (JSON Web Tokens) for stateless authentication.

1. Register via `POST /public/createUser`
2. Login via `POST /public/login` to receive a JWT token
3. Include the token in all subsequent requests:
Authorization: Bearer <your_jwt_token>

---

## 📊 Code Quality

This project integrates SonarCloud for continuous code quality analysis with the following ratings:

- **Security** — Grade A (0 open issues)
- **Reliability** — Grade A
- **Maintainability** — Grade A
- **Duplications** — 0.0%

---

## 📬 Testing

Use [Postman](https://www.postman.com/) to test the API endpoints.

1. Register a new user
2. Login to get your JWT token
3. Add the token to the `Authorization` header as `Bearer <token>`
4. Test all protected endpoints

---

## 👩‍💻 Author

**Pragya Gupta**  
[GitHub](https://github.com/pragyagupta23)
