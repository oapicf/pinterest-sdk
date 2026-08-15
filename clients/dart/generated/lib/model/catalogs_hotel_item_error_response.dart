//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelItemErrorResponse {
  /// Returns a new [CatalogsHotelItemErrorResponse] instance.
  CatalogsHotelItemErrorResponse({
    required this.catalogType,
    this.errors = const [],
    this.hotelId,
  });

  CatalogsType catalogType;

  /// Array with the errors for the item id requested
  List<ItemValidationEvent> errors;

  /// The catalog hotel id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hotelId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelItemErrorResponse &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.errors, errors) &&
    other.hotelId == hotelId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (errors.hashCode) +
    (hotelId == null ? 0 : hotelId!.hashCode);

  @override
  String toString() => 'CatalogsHotelItemErrorResponse[catalogType=$catalogType, errors=$errors, hotelId=$hotelId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'errors'] = this.errors;
    if (this.hotelId != null) {
      json[r'hotel_id'] = this.hotelId;
    } else {
      json[r'hotel_id'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelItemErrorResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelItemErrorResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelItemErrorResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelItemErrorResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelItemErrorResponse(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        hotelId: mapValueOfType<String>(json, r'hotel_id'),
      );
    }
    return null;
  }

  static List<CatalogsHotelItemErrorResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelItemErrorResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelItemErrorResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelItemErrorResponse> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelItemErrorResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelItemErrorResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelItemErrorResponse-objects as value to a dart map
  static Map<String, List<CatalogsHotelItemErrorResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelItemErrorResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelItemErrorResponse.listFromJson(entry.value, growable: growable,);
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

