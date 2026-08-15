//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelFeed {
  /// Returns a new [CatalogsHotelFeed] instance.
  CatalogsHotelFeed({
    required this.createdAt,
    required this.id,
    required this.updatedAt,
    required this.catalogId,
    required this.catalogType,
    required this.credentials,
    required this.defaultCurrency,
    required this.defaultLocale,
    required this.format,
    required this.location,
    required this.name,
    required this.preferredProcessingSchedule,
    required this.status,
  });

  DateTime createdAt;

  String id;

  DateTime updatedAt;

  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  String? catalogId;

  CatalogsType catalogType;

  CatalogsFeedCredentials? credentials;

  NullableCurrency? defaultCurrency;

  /// The locale used within a feed for product descriptions.
  String defaultLocale;

  CatalogsFormat format;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  String location;

  /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  String? name;

  CatalogsFeedProcessingSchedule? preferredProcessingSchedule;

  CatalogsStatus status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelFeed &&
    other.createdAt == createdAt &&
    other.id == id &&
    other.updatedAt == updatedAt &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.credentials == credentials &&
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
    (createdAt.hashCode) +
    (id.hashCode) +
    (updatedAt.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (credentials == null ? 0 : credentials!.hashCode) +
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (defaultLocale.hashCode) +
    (format.hashCode) +
    (location.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status.hashCode);

  @override
  String toString() => 'CatalogsHotelFeed[createdAt=$createdAt, id=$id, updatedAt=$updatedAt, catalogId=$catalogId, catalogType=$catalogType, credentials=$credentials, defaultCurrency=$defaultCurrency, defaultLocale=$defaultLocale, format=$format, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
      json[r'id'] = this.id;
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
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
    if (this.defaultCurrency != null) {
      json[r'default_currency'] = this.defaultCurrency;
    } else {
      json[r'default_currency'] = null;
    }
      json[r'default_locale'] = this.defaultLocale;
      json[r'format'] = this.format;
      json[r'location'] = this.location;
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
      json[r'status'] = this.status;
    return json;
  }

  /// Returns a new [CatalogsHotelFeed] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelFeed? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelFeed[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelFeed[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelFeed(
        createdAt: mapDateTime(json, r'created_at', r'')!,
        id: mapValueOfType<String>(json, r'id')!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
        defaultCurrency: NullableCurrency.fromJson(json[r'default_currency']),
        defaultLocale: mapValueOfType<String>(json, r'default_locale')!,
        format: CatalogsFormat.fromJson(json[r'format'])!,
        location: mapValueOfType<String>(json, r'location')!,
        name: mapValueOfType<String>(json, r'name'),
        preferredProcessingSchedule: CatalogsFeedProcessingSchedule.fromJson(json[r'preferred_processing_schedule']),
        status: CatalogsStatus.fromJson(json[r'status'])!,
      );
    }
    return null;
  }

  static List<CatalogsHotelFeed> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelFeed>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelFeed.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelFeed> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelFeed>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelFeed.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelFeed-objects as value to a dart map
  static Map<String, List<CatalogsHotelFeed>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelFeed>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelFeed.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'created_at',
    'id',
    'updated_at',
    'catalog_id',
    'catalog_type',
    'credentials',
    'default_currency',
    'default_locale',
    'format',
    'location',
    'name',
    'preferred_processing_schedule',
    'status',
  };
}

