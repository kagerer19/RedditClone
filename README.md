# RedditClone
![Work in Progress](https://img.shields.io/badge/Status-Work%20in%20Progress-yellow)

RedditClone is a Java web application built with the Spring Framework, aiming to replicate some of the core functionalities of the popular social news aggregation and discussion website, Reddit.

## Features

- User Authentication: Allows users to register, login, and logout.
- Subreddit Creation: Users can create and manage their own subreddits.
- Post Creation and Voting: Users can create posts within subreddits and vote on them.
- Commenting: Users can comment on posts and reply to other comments.
- Search Functionality: Users can search for posts and subreddits.
- User Profiles: Displays user information and their activity.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL (or your preferred database)
- Bootstrap (for styling)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/redditclone.git
   ```

2. Navigate to the project directory:

   ```bash
   cd redditclone
   ```

3. Build the project using Maven:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

5. Access the application in your web browser at [http://localhost:8080](http://localhost:8080)

## Configuration

- Database Configuration: Update the `application.properties` file with your database credentials.
- Security Configuration: Modify the security settings in `SecurityConfig.java` to match your requirements.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to contribute to the development of RedditClone.

## License

This project is licensed under the [MIT License](LICENSE).
