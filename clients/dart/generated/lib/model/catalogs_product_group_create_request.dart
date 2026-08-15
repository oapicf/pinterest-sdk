//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupCreateRequest {
  /// Returns a new [CatalogsProductGroupCreateRequest] instance.
  CatalogsProductGroupCreateRequest({
    this.description,
    required this.feedId,
    required this.filters,
    this.isFeatured = false,
    required this.name,
  });

  String? description;

  /// Catalog Feed id pertaining to the catalog product group.
  String feedId;

  CatalogsProductGroupFiltersRequest filters;

  /// boolean indicator of whether the product group is being featured or not
  bool isFeatured;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupCreateRequest &&
    other.description == description &&
    other.feedId == feedId &&
    other.filters == filters &&
    other.isFeatured == isFeatured &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (feedId.hashCode) +
    (filters.hashCode) +
    (isFeatured.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'CatalogsProductGroupCreateRequest[description=$description, feedId=$feedId, filters=$filters, isFeatured=$isFeatured, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'feed_id'] = this.feedId;
      json[r'filters'] = this.filters;
      json[r'is_featured'] = this.isFeatured;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [CatalogsProductGroupCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupCreateRequest(
        description: mapValueOfType<String>(json, r'description'),
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        filters: CatalogsProductGroupFiltersRequest.fromJson(json[r'filters'])!,
        isFeatured: mapValueOfType<bool>(json, r'is_featured') ?? false,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CatalogsProductGroupCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feed_id',
    'filters',
    'name',
  };
}

