//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AudienceCategory {
  /// Returns a new [AudienceCategory] instance.
  AudienceCategory({
    this.id,
    this.index,
    this.key,
    this.name,
    this.ratio,
    this.subcategories = const [],
  });

  /// Interest ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Interest affinity index.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? index;

  /// Interest unique key (same as ID).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? key;

  /// Interest name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Interest's percent of category's total audience.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? ratio;

  /// Subcategory interest distribution
  List<AudienceSubcategory> subcategories;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AudienceCategory &&
    other.id == id &&
    other.index == index &&
    other.key == key &&
    other.name == name &&
    other.ratio == ratio &&
    _deepEquality.equals(other.subcategories, subcategories);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (index == null ? 0 : index!.hashCode) +
    (key == null ? 0 : key!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (ratio == null ? 0 : ratio!.hashCode) +
    (subcategories.hashCode);

  @override
  String toString() => 'AudienceCategory[id=$id, index=$index, key=$key, name=$name, ratio=$ratio, subcategories=$subcategories]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.index != null) {
      json[r'index'] = this.index;
    } else {
      json[r'index'] = null;
    }
    if (this.key != null) {
      json[r'key'] = this.key;
    } else {
      json[r'key'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.ratio != null) {
      json[r'ratio'] = this.ratio;
    } else {
      json[r'ratio'] = null;
    }
      json[r'subcategories'] = this.subcategories;
    return json;
  }

  /// Returns a new [AudienceCategory] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AudienceCategory? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AudienceCategory(
        id: mapValueOfType<String>(json, r'id'),
        index: num.parse('${json[r'index']}'),
        key: mapValueOfType<String>(json, r'key'),
        name: mapValueOfType<String>(json, r'name'),
        ratio: num.parse('${json[r'ratio']}'),
        subcategories: AudienceSubcategory.listFromJson(json[r'subcategories']),
      );
    }
    return null;
  }

  static List<AudienceCategory> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AudienceCategory>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AudienceCategory.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AudienceCategory> mapFromJson(dynamic json) {
    final map = <String, AudienceCategory>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AudienceCategory.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AudienceCategory-objects as value to a dart map
  static Map<String, List<AudienceCategory>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AudienceCategory>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AudienceCategory.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

