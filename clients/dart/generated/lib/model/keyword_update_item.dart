//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordUpdateItem {
  /// Returns a new [KeywordUpdateItem] instance.
  KeywordUpdateItem({
    this.archived,
    this.bid,
    required this.id,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? archived;

  /// **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  int? bid;

  /// Keyword ID .
  String id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordUpdateItem &&
    other.archived == archived &&
    other.bid == bid &&
    other.id == id;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (archived == null ? 0 : archived!.hashCode) +
    (bid == null ? 0 : bid!.hashCode) +
    (id.hashCode);

  @override
  String toString() => 'KeywordUpdateItem[archived=$archived, bid=$bid, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.archived != null) {
      json[r'archived'] = this.archived;
    } else {
      json[r'archived'] = null;
    }
    if (this.bid != null) {
      json[r'bid'] = this.bid;
    } else {
      json[r'bid'] = null;
    }
      json[r'id'] = this.id;
    return json;
  }

  /// Returns a new [KeywordUpdateItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordUpdateItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "KeywordUpdateItem[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "KeywordUpdateItem[id]" has a null value in JSON.');
        return true;
      }());

      return KeywordUpdateItem(
        archived: mapValueOfType<bool>(json, r'archived'),
        bid: mapValueOfType<int>(json, r'bid'),
        id: mapValueOfType<String>(json, r'id')!,
      );
    }
    return null;
  }

  static List<KeywordUpdateItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordUpdateItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordUpdateItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordUpdateItem> mapFromJson(dynamic json) {
    final map = <String, KeywordUpdateItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordUpdateItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordUpdateItem-objects as value to a dart map
  static Map<String, List<KeywordUpdateItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordUpdateItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordUpdateItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

