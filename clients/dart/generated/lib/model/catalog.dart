//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Catalog {
  /// Returns a new [Catalog] instance.
  Catalog({
    required this.createdAt,
    required this.id,
    required this.updatedAt,
    required this.catalogType,
    required this.name,
  });

  DateTime createdAt;

  /// ID of the catalog entity.
  String id;

  DateTime updatedAt;

  CatalogsType catalogType;

  /// A human-friendly name associated to a catalog entity.
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Catalog &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.updatedAt == updatedAt &&
    other.catalogType == catalogType &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createdAt.hashCode) +
    (id.hashCode) +
    (updatedAt.hashCode) +
    (catalogType.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'Catalog[createdAt=$createdAt, id=$id, updatedAt=$updatedAt, catalogType=$catalogType, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
      json[r'id'] = this.id;
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
      json[r'catalog_type'] = this.catalogType;
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [Catalog] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Catalog? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Catalog[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Catalog[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Catalog(
        createdAt: mapDateTime(json, r'created_at', r'')!,
        id: mapValueOfType<String>(json, r'id')!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<Catalog> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Catalog>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Catalog.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Catalog> mapFromJson(dynamic json) {
    final map = <String, Catalog>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Catalog.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Catalog-objects as value to a dart map
  static Map<String, List<Catalog>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Catalog>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Catalog.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_at',
    'id',
    'updated_at',
    'catalog_type',
    'name',
  };
}

