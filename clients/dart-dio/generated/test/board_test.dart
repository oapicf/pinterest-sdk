import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Board
void main() {
  final instance = BoardBuilder();
  // TODO add properties to the builder and call build()

  group(Board, () {
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Date and time of board creation.
    // DateTime createdAt
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // Date and time of last board pins modified.
    // DateTime boardPinsModifiedAt
    test('to test the property `boardPinsModifiedAt`', () async {
      // TODO
    });

    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // String description
    test('to test the property `description`', () async {
      // TODO
    });

    // Count of collaborators on the board.
    // int collaboratorCount
    test('to test the property `collaboratorCount`', () async {
      // TODO
    });

    // Count of pins on the board.
    // int pinCount
    test('to test the property `pinCount`', () async {
      // TODO
    });

    // Board follower count.
    // int followerCount
    test('to test the property `followerCount`', () async {
      // TODO
    });

    // BoardMedia media
    test('to test the property `media`', () async {
      // TODO
    });

    // BoardOwner owner
    test('to test the property `owner`', () async {
      // TODO
    });

    // Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
    // String privacy (default value: 'PUBLIC')
    test('to test the property `privacy`', () async {
      // TODO
    });

  });
}
