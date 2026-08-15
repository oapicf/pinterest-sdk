//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsItemErrorResponse {
  /// Returns a new [CatalogsCreativeAssetsItemErrorResponse] instance.
  CatalogsCreativeAssetsItemErrorResponse({
    required this.catalogType,
    this.creativeAssetsId,
    this.errors = const [],
  });

  CatalogsType catalogType;

  /// The catalog creative assets id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creativeAssetsId;

  /// Array with the errors for the item id requested
  List<ItemValidationEvent> errors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsItemErrorResponse &&
    other.catalogType == catalogType &&
    other.creativeAssetsId == creativeAssetsId &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode) +
    (errors.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsItemErrorResponse[catalogType=$catalogType, creativeAssetsId=$creativeAssetsId, errors=$errors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
      json[r'errors'] = this.errors;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsItemErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsItemErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsItemErrorResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsItemErrorResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsItemErrorResponse(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsItemErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsItemErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsItemErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsItemErrorResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsItemErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsItemErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsItemErrorResponse-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsItemErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsItemErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsItemErrorResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'errors',
  };
}

