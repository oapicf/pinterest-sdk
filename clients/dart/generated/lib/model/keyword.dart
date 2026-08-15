//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Keyword {
  /// Returns a new [Keyword] instance.
  Keyword({
    this.bid,
    required this.matchType,
    required this.value,
    this.archived,
    this.id,
    this.parentId,
    this.parentType,
    this.type,
  });

  /// </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  int? bid;

  MatchTypeResponse? matchType;

  /// Keyword value (120 chars max).
  String value;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? archived;

  /// Keyword ID .
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Keyword parent entity ID (advertiser, campaign, ad group).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? parentId;

  /// Parent entity type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? parentType;

  /// Always keyword
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Keyword &&
    other.bid == bid &&
    other.matchType == matchType &&
    other.value == value &&
    other.archived == archived &&
    other.id == id &&
    other.parentId == parentId &&
    other.parentType == parentType &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (bid == null ? 0 : bid!.hashCode) +
    (matchType == null ? 0 : matchType!.hashCode) +
    (value.hashCode) +
    (archived == null ? 0 : archived!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (parentId == null ? 0 : parentId!.hashCode) +
    (parentType == null ? 0 : parentType!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'Keyword[bid=$bid, matchType=$matchType, value=$value, archived=$archived, id=$id, parentId=$parentId, parentType=$parentType, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.bid != null) {
      json[r'bid'] = this.bid;
    } else {
      json[r'bid'] = null;
    }
    if (this.matchType != null) {
      json[r'match_type'] = this.matchType;
    } else {
      json[r'match_type'] = null;
    }
      json[r'value'] = this.value;
    if (this.archived != null) {
      json[r'archived'] = this.archived;
    } else {
      json[r'archived'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.parentId != null) {
      json[r'parent_id'] = this.parentId;
    } else {
      json[r'parent_id'] = null;
    }
    if (this.parentType != null) {
      json[r'parent_type'] = this.parentType;
    } else {
      json[r'parent_type'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [Keyword] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Keyword? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Keyword[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Keyword[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Keyword(
        bid: mapValueOfType<int>(json, r'bid'),
        matchType: MatchTypeResponse.fromJson(json[r'match_type']),
        value: mapValueOfType<String>(json, r'value')!,
        archived: mapValueOfType<bool>(json, r'archived'),
        id: mapValueOfType<String>(json, r'id'),
        parentId: mapValueOfType<String>(json, r'parent_id'),
        parentType: mapValueOfType<String>(json, r'parent_type'),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<Keyword> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Keyword>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Keyword.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Keyword> mapFromJson(dynamic json) {
    final map = <String, Keyword>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Keyword.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Keyword-objects as value to a dart map
  static Map<String, List<Keyword>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Keyword>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Keyword.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'match_type',
    'value',
  };
}

