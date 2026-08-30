import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for SchedulesApi
void main() {
  final instance = Openapi().getSchedulesApi();

  group(SchedulesApi, () {
    // Create schedules
    //
    // Batch create schedules
    //
    //Future<BuiltList<SchedulesCreate200ResponseInner>> schedulesCreate(String adAccountId, BuiltList<ScheduleCreate> scheduleCreate) async
    test('test schedulesCreate', () async {
      // TODO
    });

    // Get Schedules
    //
    // Get schedules for a specific advertiser
    //
    //Future<SchedulesList200Response> schedulesList(String adAccountId, BuiltList<String> entityIds, { String bookmark, int pageSize, PinterestLibPaginationOrder order, BuiltList<ScheduleStatus> scheduleStatuses, ScheduleType scheduleType }) async
    test('test schedulesList', () async {
      // TODO
    });

    // Update schedules
    //
    // Update one or more schedules
    //
    //Future<BuiltList<SchedulesCreate200ResponseInner>> schedulesUpdate(String adAccountId, BuiltList<ScheduleBatchUpdate> scheduleBatchUpdate) async
    test('test schedulesUpdate', () async {
      // TODO
    });

  });
}
