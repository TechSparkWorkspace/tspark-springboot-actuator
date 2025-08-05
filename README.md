# 🧩 TechSpark Spring Boot Actuator Demo

This repository demonstrates the core features of Spring Boot Actuator — providing production-ready endpoints for health
checks, metrics, mappings, environment details, and more.

---

## 🚀 Getting Started

### 1. Clone the Repo

```bash
git clone https://github.com/TechSparkWorkspace/tspark-springboot-actuator.git
cd tspark-springboot-actuator
```

### 2. Run the App

Make sure you have Java 17+ and Gradle installed. Then:

```bash
./gradlew bootRun
```

The app will start on: 📍 http://localhost:8080

## 🧪 Test Actuator Endpoints

Here are some example `curl` commands to explore the actuator features:

### ✅ Health Check

```bash
curl http://localhost:8080/actuator/health
```

### ℹ️ App Info

```bash
curl http://localhost:8080/actuator/info
```

### 📈 Metrics Overview

```bash
curl http://localhost:8080/actuator/metrics
```

### 🧠 Memory Usage Metric

```bash
curl http://localhost:8080/actuator/metrics/jvm.memory.used
```

### 🌱 Environment Properties

```bash
curl http://localhost:8080/actuator/env
```

### 🗺 Endpoint Mappings

```bash
curl http://localhost:8080/actuator/mappings
```

### 🧵 Thread Dump

```bash
curl http://localhost:8080/actuator/threaddump
```

### 💾 Heap Dump

```bash
curl http://localhost:8080/actuator/heapdump --output heapdump.hprof
```

### 🛑 Shutdown App

_⚠️ Must be enabled in config_

```bash
curl -X POST http://localhost:8080/actuator/shutdown
```

## 📚 Learn More

Read the full guide here 👉 [Decoding Spring Boot Actuator]()

## 🛡️ Security Note

In production, make sure to:

- Secure actuator endpoints
- Limit exposure using exposure.include
- Never expose sensitive configs without auth


