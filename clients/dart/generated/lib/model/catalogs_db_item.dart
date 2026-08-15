//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsDbItem {
  /// Returns a new [CatalogsDbItem] instance.
  CatalogsDbItem({
    required this.createdAt,
    required this.id,
    required this.updatedAt,
  });

  DateTime createdAt;

  String id;

  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsDbItem &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createdAt.hashCode) +
    (id.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'CatalogsDbItem[createdAt=$createdAt, id=$id, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
      json[r'id'] = this.id;
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [CatalogsDbItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsDbItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsDbItem[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsDbItem[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsDbItem(
        createdAt: mapDateTime(json, r'created_at', r'')!,
        id: mapValueOfType<String>(json, r'id')!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
      );
    }
    return null;
  }

  static List<CatalogsDbItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsDbItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsDbItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsDbItem> mapFromJson(dynamic json) {
    final map = <String, CatalogsDbItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsDbItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsDbItem-objects as value to a dart map
  static Map<String, List<CatalogsDbItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsDbItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsDbItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_at',
    'id',
    'updated_at',
  };
}

