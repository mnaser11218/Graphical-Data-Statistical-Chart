# Full-Stack Data Visualization App 🚀

This app enables users to upload JSON files, store them in an H2 database, and visualize the data through algorithm-driven filters, displayed in bar, line, and pie charts. It’s built with React for the frontend and Java Spring Boot for the backend, with H2 used for data storage.

## 📂 Project Structure

### Frontend (React)
- **React**: Dynamic UI rendering and data mapping.
- **Chart.js / Recharts**: Visualizes data based on Unique ID, object type percentages, and object filters using various graphs.
- **Axios**: For backend communication.
- **Algorithms**:  
  - **Unique ID Mapping**: Ensures each object is rendered uniquely based on its ID, preventing duplicates and ensuring accurate data representation.  
  - **Sorting & Filtering**: Enables real-time sorting of data by attributes such as date, category, or percentage, and applies dynamic filters based on user-defined criteria (e.g., object type or value ranges).

### Backend (Java Spring Boot)
- **Spring Boot**: API layer and server-side logic.
- **H2 Database**: Lightweight in-memory database for data persistence.
- **Spring Data JPA**: Simplifies database interactions.
- **Spring REST API**: Handles uploads, retrieval, and CRUD operations.



## 📸 Screenshots

#### Upload JSON File:
<img width="1426" alt="Screenshot 2025-03-29 at 6 17 28 PM" src="https://github.com/user-attachments/assets/63aa5cc7-47c1-4828-ab0f-b9aeaa3e937c" />

#### Graphical Data Representation:
<img width="1405" alt="Screenshot 2025-03-29 at 6 25 05 PM" src="https://github.com/user-attachments/assets/65c91646-ff1a-4199-a5a5-a358d2f2ff87" /> 


## 📝 Features

- **Upload JSON Files**: Store data objects in the H2 database.
- **Data Visualization**: Display manipulated data through bar, line, and pie charts.
- **Advanced Algorithms**: Sort, filter, and render data with unique IDs and various obj keys.





## 📡 API Endpoints

### **POST** `/api/upload`
- Upload a JSON file to the backend.

### **GET** `/api/data`
- Fetch all stored data.

### **GET** `/api/data/{id}`
- Fetch data by ID.

## 🔧 Data Algorithms

1. **Unique ID Mapping**: Ensures no duplicates.
2. **Sorting**: Sort data by attributes (e.g., date, category).
3. **Filtering**: Filter data based on user criteria.
4. **Data Manipulation**: Apply complex calculations before rendering.


## 🚀 Getting Started

### 1. Clone the repo

```bash
git clone https://github.com/yourusername/fullstack-data-visualization.git
cd fullstack-data-visualization
```

### 2. Backend Setup

1. Ensure **Java** and **Maven** are installed.
2. Install dependencies:

   ```bash
   cd backend
   mvn clean install
   ```

3. Run the backend:

   ```bash
   mvn spring-boot:run
   ```

4. The backend runs at `http://localhost:8080`.

### 3. Frontend Setup

1. Install frontend dependencies:

   ```bash
   cd frontend
   npm install
   ```

2. Start the development server:

   ```bash
   npm start
   ```

3. Frontend runs at `http://localhost:3000`.

### 4. Access the App

Go to `http://localhost:3000`, upload JSON files, and visualize data.
## 🤝 Contributing

1. Fork the repo.
2. Create a new branch: `git checkout -b feature/your-feature`.
3. Commit your changes: `git commit -am 'Add your feature'`.
4. Push: `git push origin feature/your-feature`.
5. Open a pull request.

---

Thanks for checking out the project! Enjoy working with the data visualizations!  
🚀 **Let’s build something amazing!**

