//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsFeed {
  /// Returns a new [CatalogsCreativeAssetsFeed] instance.
  CatalogsCreativeAssetsFeed({
    required this.catalogId,
    required this.catalogType,
    required this.createdAt,
    this.credentials,
    required this.defaultCountry,
    this.defaultCurrency,
    required this.defaultLocale,
    required this.format,
    required this.id,
    required this.location,
    required this.name,
    this.preferredProcessingSchedule,
    required this.status,
    required this.updatedAt,
  });

  /// Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
  String catalogId;

  CatalogsCreativeAssetsFeedCatalogTypeEnum catalogType;

  DateTime createdAt;

  CatalogsFeedCredentials? credentials;

  Country defaultCountry;

  NullableCurrency? defaultCurrency;

  /// The locale used within a feed for product descriptions.
  String defaultLocale;

  CatalogsFormat format;

  /// ID of the feed entity.
  String id;

  /// The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
  String location;

  /// A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
  String? name;

  CatalogsFeedProcessingSchedule? preferredProcessingSchedule;

  CatalogsStatus status;

  DateTime updatedAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsFeed &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.createdAt == createdAt &&
    other.credentials == credentials &&
    other.defaultCountry == defaultCountry &&
    other.defaultCurrency == defaultCurrency &&
    other.defaultLocale == defaultLocale &&
    other.format == format &&
    other.id == id &&
    other.location == location &&
    other.name == name &&
    other.preferredProcessingSchedule == preferredProcessingSchedule &&
    other.status == status &&
    other.updatedAt == updatedAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (createdAt.hashCode) +
    (credentials == null ? 0 : credentials!.hashCode) +
    (defaultCountry.hashCode) +
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (defaultLocale.hashCode) +
    (format.hashCode) +
    (id.hashCode) +
    (location.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status.hashCode) +
    (updatedAt.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsFeed[catalogId=$catalogId, catalogType=$catalogType, createdAt=$createdAt, credentials=$credentials, defaultCountry=$defaultCountry, defaultCurrency=$defaultCurrency, defaultLocale=$defaultLocale, format=$format, id=$id, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status, updatedAt=$updatedAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
      json[r'created_at'] = this.createdAt.toUtc().toIso8601String();
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
      json[r'id'] = this.id;
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
      json[r'updated_at'] = this.updatedAt.toUtc().toIso8601String();
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsFeed] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsFeed? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_id'), 'Required key "CatalogsCreativeAssetsFeed[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "CatalogsCreativeAssetsFeed[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsFeed[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsFeed[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'created_at'), 'Required key "CatalogsCreativeAssetsFeed[created_at]" is missing from JSON.');
        assert(json[r'created_at'] != null, 'Required key "CatalogsCreativeAssetsFeed[created_at]" has a null value in JSON.');
        assert(json.containsKey(r'default_country'), 'Required key "CatalogsCreativeAssetsFeed[default_country]" is missing from JSON.');
        assert(json[r'default_country'] != null, 'Required key "CatalogsCreativeAssetsFeed[default_country]" has a null value in JSON.');
        assert(json.containsKey(r'default_locale'), 'Required key "CatalogsCreativeAssetsFeed[default_locale]" is missing from JSON.');
        assert(json[r'default_locale'] != null, 'Required key "CatalogsCreativeAssetsFeed[default_locale]" has a null value in JSON.');
        assert(json.containsKey(r'format'), 'Required key "CatalogsCreativeAssetsFeed[format]" is missing from JSON.');
        assert(json[r'format'] != null, 'Required key "CatalogsCreativeAssetsFeed[format]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "CatalogsCreativeAssetsFeed[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CatalogsCreativeAssetsFeed[id]" has a null value in JSON.');
        assert(json.containsKey(r'location'), 'Required key "CatalogsCreativeAssetsFeed[location]" is missing from JSON.');
        assert(json[r'location'] != null, 'Required key "CatalogsCreativeAssetsFeed[location]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CatalogsCreativeAssetsFeed[name]" is missing from JSON.');
        assert(json.containsKey(r'status'), 'Required key "CatalogsCreativeAssetsFeed[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "CatalogsCreativeAssetsFeed[status]" has a null value in JSON.');
        assert(json.containsKey(r'updated_at'), 'Required key "CatalogsCreativeAssetsFeed[updated_at]" is missing from JSON.');
        assert(json[r'updated_at'] != null, 'Required key "CatalogsCreativeAssetsFeed[updated_at]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsFeed(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsCreativeAssetsFeedCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        createdAt: mapDateTime(json, r'created_at', r'')!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
        defaultCountry: Country.fromJson(json[r'default_country'])!,
        defaultCurrency: NullableCurrency.fromJson(json[r'default_currency']),
        defaultLocale: mapValueOfType<String>(json, r'default_locale')!,
        format: CatalogsFormat.fromJson(json[r'format'])!,
        id: mapValueOfType<String>(json, r'id')!,
        location: mapValueOfType<String>(json, r'location')!,
        name: mapValueOfType<String>(json, r'name'),
        preferredProcessingSchedule: CatalogsFeedProcessingSchedule.fromJson(json[r'preferred_processing_schedule']),
        status: CatalogsStatus.fromJson(json[r'status'])!,
        updatedAt: mapDateTime(json, r'updated_at', r'')!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsFeed> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFeed>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFeed.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsFeed> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsFeed>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsFeed.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsFeed-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsFeed>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsFeed>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsFeed.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'created_at',
    'default_country',
    'default_locale',
    'format',
    'id',
    'location',
    'name',
    'status',
    'updated_at',
  };
}


enum CatalogsCreativeAssetsFeedCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsFeedCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsFeedCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsFeedCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsFeedCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsFeedCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFeedCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFeedCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsFeedCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsFeedCatalogTypeEnum].
class CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsFeedCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsFeedCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsFeedCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsFeedCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsFeedCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsFeedCatalogTypeEnumTypeTransformer? _instance;
}


