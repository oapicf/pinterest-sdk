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
    this.archived,
    this.bid,
    required this.id,
    required this.matchType,
    required this.parentId,
    this.parentType,
    this.type,
    required this.value,
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

  /// Keyword [match type](/docs/api-features/targeting-overview/)
  MatchType? matchType;

  /// Keyword parent entity ID (advertiser, campaign, ad group).
  String parentId;

  /// Parent entity type (advertiser, campaign, ad group).
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

  /// Keyword value (120 chars max).
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Keyword &&
    other.archived == archived &&
    other.bid == bid &&
    other.id == id &&
    other.matchType == matchType &&
    other.parentId == parentId &&
    other.parentType == parentType &&
    other.type == type &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (archived == null ? 0 : archived!.hashCode) +
    (bid == null ? 0 : bid!.hashCode) +
    (id.hashCode) +
    (matchType == null ? 0 : matchType!.hashCode) +
    (parentId.hashCode) +
    (parentType == null ? 0 : parentType!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'Keyword[archived=$archived, bid=$bid, id=$id, matchType=$matchType, parentId=$parentId, parentType=$parentType, type=$type, value=$value]';

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
    if (this.matchType != null) {
      json[r'match_type'] = this.matchType;
    } else {
      json[r'match_type'] = null;
    }
      json[r'parent_id'] = this.parentId;
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
      json[r'value'] = this.value;
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
        assert(json.containsKey(r'id'), 'Required key "Keyword[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Keyword[id]" has a null value in JSON.');
        assert(json.containsKey(r'match_type'), 'Required key "Keyword[match_type]" is missing from JSON.');
        assert(json.containsKey(r'parent_id'), 'Required key "Keyword[parent_id]" is missing from JSON.');
        assert(json[r'parent_id'] != null, 'Required key "Keyword[parent_id]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "Keyword[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "Keyword[value]" has a null value in JSON.');
        return true;
      }());

      return Keyword(
        archived: mapValueOfType<bool>(json, r'archived'),
        bid: mapValueOfType<int>(json, r'bid'),
        id: mapValueOfType<String>(json, r'id')!,
        matchType: MatchType.fromJson(json[r'match_type']),
        parentId: mapValueOfType<String>(json, r'parent_id')!,
        parentType: mapValueOfType<String>(json, r'parent_type'),
        type: mapValueOfType<String>(json, r'type'),
        value: mapValueOfType<String>(json, r'value')!,
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
    'id',
    'match_type',
    'parent_id',
    'value',
  };
}

