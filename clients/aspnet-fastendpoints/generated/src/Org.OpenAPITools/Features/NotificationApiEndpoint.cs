using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Receive notifications from external partners.
/// </summary>

public class NotificationPostEndpoint : FastEndpoints.Endpoint<NotificationPostRequest, NotificationResponse>
{
    public override void Configure()
    {
        Post("/v5/notifications");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("notification");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 0);
        });

        Summary(s => {
            s.Summary = "Receive notifications from external partners.";
            s.RequestParam(r => r.notificationPostRequest, "");
            s.Responses[200] = "The request has succeeded.";
            s.Responses[400] = "The request could not be understood by the server due to unexpected data.";
            s.Responses[0] = "An unexpected error response.";
        });
    }

    public override async Task HandleAsync(NotificationPostRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

