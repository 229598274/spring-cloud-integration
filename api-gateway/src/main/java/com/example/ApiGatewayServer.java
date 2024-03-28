package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayServer {
//    @Autowired
//    private TokenRelayGatewayFilterFactory filterFactory;

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        //@formatter:off
////        return builder.routes()
////                .route("resource", r -> r.path("/a/**")
////                        .filters(f -> f.filter(filterFactory.apply()))
////                        .uri("http://localhost:17612"))
////                .build();
//        //@formatter:on
//    }

//    @Autowired(required=false)
//    private ClientRegistrationRepository clientRegistrationRepository;
//
//    @GetMapping("/")
//    public String index(Model model,
//                        @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
//                        @AuthenticationPrincipal OAuth2User oauth2User) {
//        model.addAttribute("userName", oauth2User.getName());
//        model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
//        model.addAttribute("userAttributes", oauth2User.getAttributes());
//        System.out.println(oauth2User.getName());
//        System.out.println(authorizedClient.getClientRegistration().getClientName());
//        System.out.println(oauth2User.getAttributes());
//        SecurityContext securityContext = SecurityContextHolder.getContext();
//        ClientRegistrationRepository clientRegistrationRepository=this.clientRegistrationRepository;
//
//        return "index";
//    }


    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayServer.class, args);
    }
}