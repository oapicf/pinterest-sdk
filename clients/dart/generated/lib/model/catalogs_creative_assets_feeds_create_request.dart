//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsFeedsCreateRequest {
  /// Returns a new [CatalogsCreativeAssetsFeedsCreateRequest] instance.
  CatalogsCreativeAssetsFeedsCreateRequest({
    this.catalogId,
    required this.catalogType,
    this.credentials,
    required this.defaultCountry,
    this.defaultCurrency,
    required this.defaultLocale,
    required this.format,
    required this.location,
    required this.name,
    this.preferredProcessingSchedule,
    this.status = 'ACTIVE',
  });

  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsType catalogType;

  CatalogsFeedCredentials? credentials;

  Country defaultCountry;

  NullableCurrency? defaultCurrency;

  CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  CatalogsFormat format;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  String location;

  /// A human-friendly name associated to a given feed.
  String name;

  CatalogsFeedProcessingSchedule? preferredProcessingSchedule;

  CatalogsStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsFeedsCreateRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.credentials == credentials &&
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
    (defaultCountry.hashCode) +
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (defaultLocale.hashCode) +
    (format.hashCode) +
    (location.hashCode) +
    (name.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsFeedsCreateRequest[catalogId=$catalogId, catalogType=$catalogType, credentials=$credentials, defaultCountry=$defaultCountry, defaultCurrency=$defaultCurrency, defaultLocale=$defaultLocale, format=$format, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status]';

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

  /// Returns a new [CatalogsCreativeAssetsFeedsCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsFeedsCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsFeedsCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsFeedsCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsFeedsCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
        defaultCountry: Country.fromJson(json[r'default_country'])!,
        defaultCurrency: NullableCurrency.fromJson(json[r'default_currency']),
        defaultLocale: CatalogsFeedsCreateRequestDefaultLocale.fromJson(json[r'default_locale'])!,
        format: CatalogsFormat.fromJson(json[r'format'])!,
        location: mapValueOfType<String>(json, r'location')!,
        name: mapValueOfType<String>(json, r'name')!,
        preferredProcessingSchedule: CatalogsFeedProcessingSchedule.fromJson(json[r'preferred_processing_schedule']),
        status: CatalogsStatus.fromJson(json[r'status']) ?? 'ACTIVE',
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsFeedsCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFeedsCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFeedsCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsFeedsCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsFeedsCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsFeedsCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsFeedsCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsFeedsCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsFeedsCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsFeedsCreateRequest.listFromJson(entry.value, growable: growable,);
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

