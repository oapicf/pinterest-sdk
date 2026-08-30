//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailFeedsCreateRequest {
  /// Returns a new [CatalogsRetailFeedsCreateRequest] instance.
  CatalogsRetailFeedsCreateRequest({
    this.catalogId,
    required this.catalogType,
    this.credentials,
    this.defaultAvailability,
    required this.defaultCountry,
    this.defaultCurrency,
    required this.defaultLocale,
    required this.format,
    required this.location,
    required this.name,
    this.preferredProcessingSchedule,
    this.status = CatalogsStatus.ACTIVE,
  });

  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsRetailFeedsCreateRequestCatalogTypeEnum catalogType;

  CatalogsFeedCredentials? credentials;

  ProductAvailabilityType? defaultAvailability;

  Country defaultCountry;

  NullableCurrency? defaultCurrency;

  CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale defaultLocale;

  CatalogsFormat format;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  String location;

  /// A human-friendly name associated to a given feed.
  String name;

  CatalogsFeedProcessingSchedule? preferredProcessingSchedule;

  CatalogsStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailFeedsCreateRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.credentials == credentials &&
    other.defaultAvailability == defaultAvailability &&
    other.defaultCountry == defaultCountry &&
    other.defaultCurrency == defaultCurrency &&
    other.defaultLocale == defaultLocale &&
    other.format == format &&
    other.location == location &&
    other.name == name &&
    other.preferredProcessingSchedule == preferredProcessingSchedule &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (credentials == null ? 0 : credentials!.hashCode) +
    (defaultAvailability == null ? 0 : defaultAvailability!.hashCode) +
    (defaultCountry.hashCode) +
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (defaultLocale.hashCode) +
    (format.hashCode) +
    (location.hashCode) +
    (name.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'CatalogsRetailFeedsCreateRequest[catalogId=$catalogId, catalogType=$catalogType, credentials=$credentials, defaultAvailability=$defaultAvailability, defaultCountry=$defaultCountry, defaultCurrency=$defaultCurrency, defaultLocale=$defaultLocale, format=$format, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
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
      json[r'default_country'] = this.defaultCountry;
    if (this.defaultCurrency != null) {
      json[r'default_currency'] = this.defaultCurrency;
    } else {
      json[r'default_currency'] = null;
    }
      json[r'default_locale'] = this.defaultLocale;
      json[r'format'] = this.format;
      json[r'location'] = this.location;
      json[r'name'] = this.name;
    if (this.preferredProcessingSchedule != null) {
      json[r'preferred_processing_schedule'] = this.preferredProcessingSchedule;
    } else {
      json[r'preferred_processing_schedule'] = null;
    }
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [CatalogsRetailFeedsCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailFeedsCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailFeedsCreateRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'default_country'), 'Required key "CatalogsRetailFeedsCreateRequest[default_country]" is missing from JSON.');
        assert(json[r'default_country'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[default_country]" has a null value in JSON.');
        assert(json.containsKey(r'default_locale'), 'Required key "CatalogsRetailFeedsCreateRequest[default_locale]" is missing from JSON.');
        assert(json[r'default_locale'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[default_locale]" has a null value in JSON.');
        assert(json.containsKey(r'format'), 'Required key "CatalogsRetailFeedsCreateRequest[format]" is missing from JSON.');
        assert(json[r'format'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[format]" has a null value in JSON.');
        assert(json.containsKey(r'location'), 'Required key "CatalogsRetailFeedsCreateRequest[location]" is missing from JSON.');
        assert(json[r'location'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[location]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CatalogsRetailFeedsCreateRequest[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CatalogsRetailFeedsCreateRequest[name]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailFeedsCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsRetailFeedsCreateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
        defaultAvailability: ProductAvailabilityType.fromJson(json[r'default_availability']),
        defaultCountry: Country.fromJson(json[r'default_country'])!,
        defaultCurrency: NullableCurrency.fromJson(json[r'default_currency']),
        defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.fromJson(json[r'default_locale'])!,
        format: CatalogsFormat.fromJson(json[r'format'])!,
        location: mapValueOfType<String>(json, r'location')!,
        name: mapValueOfType<String>(json, r'name')!,
        preferredProcessingSchedule: CatalogsFeedProcessingSchedule.fromJson(json[r'preferred_processing_schedule']),
        status: CatalogsStatus.fromJson(json[r'status']) ?? CatalogsStatus.ACTIVE,
      );
    }
    return null;
  }

  static List<CatalogsRetailFeedsCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailFeedsCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailFeedsCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailFeedsCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailFeedsCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailFeedsCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailFeedsCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsRetailFeedsCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailFeedsCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailFeedsCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'default_country',
    'default_locale',
    'format',
    'location',
    'name',
  };
}


enum CatalogsRetailFeedsCreateRequestCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailFeedsCreateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailFeedsCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailFeedsCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailFeedsCreateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailFeedsCreateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailFeedsCreateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailFeedsCreateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailFeedsCreateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailFeedsCreateRequestCatalogTypeEnum].
class CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailFeedsCreateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailFeedsCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailFeedsCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailFeedsCreateRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailFeedsCreateRequestCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailFeedsCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


