import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for OrderLinesApi
void main() {
  final instance = Openapi().getOrderLinesApi();

  group(OrderLinesApi, () {
    // Get order line
    //
    // Get a specific existing order line associated with an ad account.
    //
    //Future<OrderLine> orderLinesGet(String adAccountId, String orderLineId) async
    test('test orderLinesGet', () async {
      // TODO
    });

    // Get order lines
    //
    // List existing order lines associated with an ad account.
    //
    //Future<OrderLinesList200Response> orderLinesList(String adAccountId, { int pageSize, String order, String bookmark }) async
    test('test orderLinesList', () async {
      // TODO
    });

  });
}
