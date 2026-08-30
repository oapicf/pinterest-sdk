//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsVerticalFeedsUpdateRequest {
  /// Returns a new [CatalogsVerticalFeedsUpdateRequest] instance.
  CatalogsVerticalFeedsUpdateRequest({
    required this.catalogType,
    this.credentials,
    this.defaultAvailability,
    this.defaultCurrency,
    this.format,
    this.location,
    this.name,
    this.preferredProcessingSchedule,
    this.status,
  });

  CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum catalogType;

  CatalogsFeedCredentials? credentials;

  ProductAvailabilityType? defaultAvailability;

  NullableCurrency? defaultCurrency;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsFormat? format;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? location;

  /// A human-friendly name associated to a given feed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  CatalogsFeedProcessingSchedule? preferredProcessingSchedule;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsVerticalFeedsUpdateRequest &&
    other.catalogType == catalogType &&
    other.credentials == credentials &&
    other.defaultAvailability == defaultAvailability &&
    other.defaultCurrency == defaultCurrency &&
    other.format == format &&
    other.location == location &&
    other.name == name &&
    other.preferredProcessingSchedule == preferredProcessingSchedule &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (credentials == null ? 0 : credentials!.hashCode) +
    (defaultAvailability == null ? 0 : defaultAvailability!.hashCode) +
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (format == null ? 0 : format!.hashCode) +
    (location == null ? 0 : location!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'CatalogsVerticalFeedsUpdateRequest[catalogType=$catalogType, credentials=$credentials, defaultAvailability=$defaultAvailability, defaultCurrency=$defaultCurrency, format=$format, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
    if (this.credentials != null) {
      json[r'credentials'] = this.credentials;
    } else {
      json[r'credentials'] = null;
    }
    if (this.defaultAvailability != null) {
      json[r'default_availability'] = this.defaultAvailability;
    } else {
      json[r'default_availability'] = null;
    }
    if (this.defaultCurrency != null) {
      json[r'default_currency'] = this.defaultCurrency;
    } else {
      json[r'default_currency'] = null;
    }
    if (this.format != null) {
      json[r'format'] = this.format;
    } else {
      json[r'format'] = null;
    }
    if (this.location != null) {
      json[r'location'] = this.location;
    } else {
      json[r'location'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.preferredProcessingSchedule != null) {
      json[r'preferred_processing_schedule'] = this.preferredProcessingSchedule;
    } else {
      json[r'preferred_processing_schedule'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsVerticalFeedsUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsVerticalFeedsUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsVerticalFeedsUpdateRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsVerticalFeedsUpdateRequest[catalog_type]" has a null value in JSON.');
        return true;
      }());

      return CatalogsVerticalFeedsUpdateRequest(
        catalogType: CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
        defaultAvailability: ProductAvailabilityType.fromJson(json[r'default_availability']),
        defaultCurrency: NullableCurrency.fromJson(json[r'default_currency']),
        format: CatalogsFormat.fromJson(json[r'format']),
        location: mapValueOfType<String>(json, r'location'),
        name: mapValueOfType<String>(json, r'name'),
        preferredProcessingSchedule: CatalogsFeedProcessingSchedule.fromJson(json[r'preferred_processing_schedule']),
        status: CatalogsStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<CatalogsVerticalFeedsUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalFeedsUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalFeedsUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsVerticalFeedsUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsVerticalFeedsUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsVerticalFeedsUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsVerticalFeedsUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsVerticalFeedsUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsVerticalFeedsUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsVerticalFeedsUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
  };
}


enum CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum].
class CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsVerticalFeedsUpdateRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsVerticalFeedsUpdateRequestCatalogTypeEnumTypeTransformer? _instance;
}


