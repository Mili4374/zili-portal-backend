@Override
public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
            .allowedOrigins(
                "https://zili-portal-frontend.vercel.app",
                "https://zili-portal-frontend-milis-projects.vercel.app" // Add any other Vercel variants you see in your browser bar
            )
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .allowedHeaders("*")
            .allowCredentials(true)
            .maxAge(3600); // Caches the "handshake" for 1 hour so it's faster
}