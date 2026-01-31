import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for BoardCreate
void main() {
  final instance = BoardCreateBuilder();
  // TODO add properties to the builder and call build()

  group(BoardCreate, () {
    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // If set to `true`, the board will be ad-only and can store ad-only Pins.
    // bool isAdsOnly (default value: false)
    test('to test the property `isAdsOnly`', () async {
      // TODO
    });

    //      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    //     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
    // BoardPrivacy privacy (default value: BoardPrivacy.PUBLIC)
    test('to test the property `privacy`', () async {
      // TODO
    });

  });
}
