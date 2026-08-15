//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsFeedsUpdateRequest {
  /// Returns a new [CatalogsCreativeAssetsFeedsUpdateRequest] instance.
  CatalogsCreativeAssetsFeedsUpdateRequest({
    required this.catalogType,
    this.credentials,
    this.defaultCurrency,
    this.format,
    this.location,
    this.name,
    this.preferredProcessingSchedule,
    this.status,
  });

  CatalogsType catalogType;

  CatalogsFeedCredentials? credentials;

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
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsFeedsUpdateRequest &&
    other.catalogType == catalogType &&
    other.credentials == credentials &&
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
    (defaultCurrency == null ? 0 : defaultCurrency!.hashCode) +
    (format == null ? 0 : format!.hashCode) +
    (location == null ? 0 : location!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (preferredProcessingSchedule == null ? 0 : preferredProcessingSchedule!.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsFeedsUpdateRequest[catalogType=$catalogType, credentials=$credentials, defaultCurrency=$defaultCurrency, format=$format, location=$location, name=$name, preferredProcessingSchedule=$preferredProcessingSchedule, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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

  /// Returns a new [CatalogsCreativeAssetsFeedsUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsFeedsUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsFeedsUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsFeedsUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsFeedsUpdateRequest(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        credentials: CatalogsFeedCredentials.fromJson(json[r'credentials']),
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

  static List<CatalogsCreativeAssetsFeedsUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsFeedsUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsFeedsUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsFeedsUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsFeedsUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsFeedsUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsFeedsUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsFeedsUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsFeedsUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsFeedsUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
  };
}

