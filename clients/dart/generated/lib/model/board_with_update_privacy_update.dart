//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BoardWithUpdatePrivacyUpdate {
  /// Returns a new [BoardWithUpdatePrivacyUpdate] instance.
  BoardWithUpdatePrivacyUpdate({
    this.description,
    this.name,
    this.privacy,
  });

  String? description;

  ///      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BoardUpdatePrivacy? privacy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BoardWithUpdatePrivacyUpdate &&
    other.description == description &&
    other.name == name &&
    other.privacy == privacy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (privacy == null ? 0 : privacy!.hashCode);

  @override
  String toString() => 'BoardWithUpdatePrivacyUpdate[description=$description, name=$name, privacy=$privacy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.privacy != null) {
      json[r'privacy'] = this.privacy;
    } else {
      json[r'privacy'] = null;
    }
    return json;
  }

  /// Returns a new [BoardWithUpdatePrivacyUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BoardWithUpdatePrivacyUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BoardWithUpdatePrivacyUpdate[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BoardWithUpdatePrivacyUpdate[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BoardWithUpdatePrivacyUpdate(
        description: mapValueOfType<String>(json, r'description'),
        name: mapValueOfType<String>(json, r'name'),
        privacy: BoardUpdatePrivacy.fromJson(json[r'privacy']),
      );
    }
    return null;
  }

  static List<BoardWithUpdatePrivacyUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BoardWithUpdatePrivacyUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BoardWithUpdatePrivacyUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BoardWithUpdatePrivacyUpdate> mapFromJson(dynamic json) {
    final map = <String, BoardWithUpdatePrivacyUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BoardWithUpdatePrivacyUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BoardWithUpdatePrivacyUpdate-objects as value to a dart map
  static Map<String, List<BoardWithUpdatePrivacyUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BoardWithUpdatePrivacyUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BoardWithUpdatePrivacyUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

