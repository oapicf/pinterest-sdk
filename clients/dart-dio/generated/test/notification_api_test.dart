import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for NotificationApi
void main() {
  final instance = Openapi().getNotificationApi();

  group(NotificationApi, () {
    // Receive notifications from external partners.
    //
    // Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.
    //
    //Future<NotificationResponse> notificationPost(NotificationPostRequest notificationPostRequest) async
    test('test notificationPost', () async {
      // TODO
    });

  });
}
