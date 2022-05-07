//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.0

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for BoardsApi
void main() {
  final instance = BoardsApi();

  group('tests for BoardsApi', () {
    // Create board section
    //
    // Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<BoardSection> boardSectionsCreate(String boardId, BoardSection boardSection) async
    test('test boardSectionsCreate', () async {
      // TODO
    });

    // Delete board section
    //
    // Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future boardSectionsDelete(String boardId, String sectionId) async
    test('test boardSectionsDelete', () async {
      // TODO
    });

    // List board sections
    //
    // Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<Paginated> boardSectionsList(String boardId, { String bookmark, int pageSize }) async
    test('test boardSectionsList', () async {
      // TODO
    });

    // List Pins on board section
    //
    // Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<Paginated> boardSectionsListPins(String boardId, String sectionId, { String bookmark, int pageSize }) async
    test('test boardSectionsListPins', () async {
      // TODO
    });

    // Update board section
    //
    // Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<BoardSection> boardSectionsUpdate(String boardId, String sectionId, BoardSection boardSection) async
    test('test boardSectionsUpdate', () async {
      // TODO
    });

    // Create board
    //
    // Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<Board> boardsCreate(Board board) async
    test('test boardsCreate', () async {
      // TODO
    });

    // Delete board
    //
    // Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
    //
    //Future boardsDelete(String boardId) async
    test('test boardsDelete', () async {
      // TODO
    });

    // Get board
    //
    // Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<Board> boardsGet(String boardId) async
    test('test boardsGet', () async {
      // TODO
    });

    // List boards
    //
    // Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
    //
    //Future<Paginated> boardsList({ String bookmark, int pageSize, String privacy }) async
    test('test boardsList', () async {
      // TODO
    });

    // List Pins on board
    //
    // Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.
    //
    //Future<Paginated> boardsListPins(String boardId, { String bookmark, int pageSize }) async
    test('test boardsListPins', () async {
      // TODO
    });

    // Update board
    //
    // Update a board owned by the \"operating user_account\".
    //
    //Future<Board> boardsUpdate(String boardId, BoardUpdate boardUpdate) async
    test('test boardsUpdate', () async {
      // TODO
    });

  });
}
