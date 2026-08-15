//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsFeedIngestionErrors {
  /// Returns a new [CatalogsFeedIngestionErrors] instance.
  CatalogsFeedIngestionErrors({
    this.ACCOUNT_FLAGGED,
    this.FETCH_GOOGLE_SHEET_NOT_SHARED,
    this.IMAGE_FILE_NOT_ACCESSIBLE,
    this.IMAGE_FILE_NOT_FOUND,
    this.IMAGE_INVALID_FILE,
    this.IMAGE_LEVEL_INTERNAL_ERROR,
    this.IMAGE_MALFORMED_URL,
    this.LARGE_PRODUCT_COUNT_DECREASE,
    this.LINE_LEVEL_INTERNAL_ERROR,
  });

  /// We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? ACCOUNT_FLAGGED;

  /// Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? FETCH_GOOGLE_SHEET_NOT_SHARED;

  /// Image files are unreadable. Please upload new files to continue.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_FILE_NOT_ACCESSIBLE;

  /// Image files are unreadable. Please upload new files to continue.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_FILE_NOT_FOUND;

  /// Image files are unreadable. Please upload new files to continue.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_INVALID_FILE;

  /// We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_LEVEL_INTERNAL_ERROR;

  /// Image files are unreadable. Please check your link and upload new files to continue.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? IMAGE_MALFORMED_URL;

  /// The product count has decreased by more than 99% compared to the last successful ingestion.
  CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum? LARGE_PRODUCT_COUNT_DECREASE;

  /// We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? LINE_LEVEL_INTERNAL_ERROR;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsFeedIngestionErrors &&
    other.ACCOUNT_FLAGGED == ACCOUNT_FLAGGED &&
    other.FETCH_GOOGLE_SHEET_NOT_SHARED == FETCH_GOOGLE_SHEET_NOT_SHARED &&
    other.IMAGE_FILE_NOT_ACCESSIBLE == IMAGE_FILE_NOT_ACCESSIBLE &&
    other.IMAGE_FILE_NOT_FOUND == IMAGE_FILE_NOT_FOUND &&
    other.IMAGE_INVALID_FILE == IMAGE_INVALID_FILE &&
    other.IMAGE_LEVEL_INTERNAL_ERROR == IMAGE_LEVEL_INTERNAL_ERROR &&
    other.IMAGE_MALFORMED_URL == IMAGE_MALFORMED_URL &&
    other.LARGE_PRODUCT_COUNT_DECREASE == LARGE_PRODUCT_COUNT_DECREASE &&
    other.LINE_LEVEL_INTERNAL_ERROR == LINE_LEVEL_INTERNAL_ERROR;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ACCOUNT_FLAGGED == null ? 0 : ACCOUNT_FLAGGED!.hashCode) +
    (FETCH_GOOGLE_SHEET_NOT_SHARED == null ? 0 : FETCH_GOOGLE_SHEET_NOT_SHARED!.hashCode) +
    (IMAGE_FILE_NOT_ACCESSIBLE == null ? 0 : IMAGE_FILE_NOT_ACCESSIBLE!.hashCode) +
    (IMAGE_FILE_NOT_FOUND == null ? 0 : IMAGE_FILE_NOT_FOUND!.hashCode) +
    (IMAGE_INVALID_FILE == null ? 0 : IMAGE_INVALID_FILE!.hashCode) +
    (IMAGE_LEVEL_INTERNAL_ERROR == null ? 0 : IMAGE_LEVEL_INTERNAL_ERROR!.hashCode) +
    (IMAGE_MALFORMED_URL == null ? 0 : IMAGE_MALFORMED_URL!.hashCode) +
    (LARGE_PRODUCT_COUNT_DECREASE == null ? 0 : LARGE_PRODUCT_COUNT_DECREASE!.hashCode) +
    (LINE_LEVEL_INTERNAL_ERROR == null ? 0 : LINE_LEVEL_INTERNAL_ERROR!.hashCode);

  @override
  String toString() => 'CatalogsFeedIngestionErrors[ACCOUNT_FLAGGED=$ACCOUNT_FLAGGED, FETCH_GOOGLE_SHEET_NOT_SHARED=$FETCH_GOOGLE_SHEET_NOT_SHARED, IMAGE_FILE_NOT_ACCESSIBLE=$IMAGE_FILE_NOT_ACCESSIBLE, IMAGE_FILE_NOT_FOUND=$IMAGE_FILE_NOT_FOUND, IMAGE_INVALID_FILE=$IMAGE_INVALID_FILE, IMAGE_LEVEL_INTERNAL_ERROR=$IMAGE_LEVEL_INTERNAL_ERROR, IMAGE_MALFORMED_URL=$IMAGE_MALFORMED_URL, LARGE_PRODUCT_COUNT_DECREASE=$LARGE_PRODUCT_COUNT_DECREASE, LINE_LEVEL_INTERNAL_ERROR=$LINE_LEVEL_INTERNAL_ERROR]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.ACCOUNT_FLAGGED != null) {
      json[r'ACCOUNT_FLAGGED'] = this.ACCOUNT_FLAGGED;
    } else {
      json[r'ACCOUNT_FLAGGED'] = null;
    }
    if (this.FETCH_GOOGLE_SHEET_NOT_SHARED != null) {
      json[r'FETCH_GOOGLE_SHEET_NOT_SHARED'] = this.FETCH_GOOGLE_SHEET_NOT_SHARED;
    } else {
      json[r'FETCH_GOOGLE_SHEET_NOT_SHARED'] = null;
    }
    if (this.IMAGE_FILE_NOT_ACCESSIBLE != null) {
      json[r'IMAGE_FILE_NOT_ACCESSIBLE'] = this.IMAGE_FILE_NOT_ACCESSIBLE;
    } else {
      json[r'IMAGE_FILE_NOT_ACCESSIBLE'] = null;
    }
    if (this.IMAGE_FILE_NOT_FOUND != null) {
      json[r'IMAGE_FILE_NOT_FOUND'] = this.IMAGE_FILE_NOT_FOUND;
    } else {
      json[r'IMAGE_FILE_NOT_FOUND'] = null;
    }
    if (this.IMAGE_INVALID_FILE != null) {
      json[r'IMAGE_INVALID_FILE'] = this.IMAGE_INVALID_FILE;
    } else {
      json[r'IMAGE_INVALID_FILE'] = null;
    }
    if (this.IMAGE_LEVEL_INTERNAL_ERROR != null) {
      json[r'IMAGE_LEVEL_INTERNAL_ERROR'] = this.IMAGE_LEVEL_INTERNAL_ERROR;
    } else {
      json[r'IMAGE_LEVEL_INTERNAL_ERROR'] = null;
    }
    if (this.IMAGE_MALFORMED_URL != null) {
      json[r'IMAGE_MALFORMED_URL'] = this.IMAGE_MALFORMED_URL;
    } else {
      json[r'IMAGE_MALFORMED_URL'] = null;
    }
    if (this.LARGE_PRODUCT_COUNT_DECREASE != null) {
      json[r'LARGE_PRODUCT_COUNT_DECREASE'] = this.LARGE_PRODUCT_COUNT_DECREASE;
    } else {
      json[r'LARGE_PRODUCT_COUNT_DECREASE'] = null;
    }
    if (this.LINE_LEVEL_INTERNAL_ERROR != null) {
      json[r'LINE_LEVEL_INTERNAL_ERROR'] = this.LINE_LEVEL_INTERNAL_ERROR;
    } else {
      json[r'LINE_LEVEL_INTERNAL_ERROR'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsFeedIngestionErrors] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsFeedIngestionErrors? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsFeedIngestionErrors[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsFeedIngestionErrors[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsFeedIngestionErrors(
        ACCOUNT_FLAGGED: mapValueOfType<int>(json, r'ACCOUNT_FLAGGED'),
        FETCH_GOOGLE_SHEET_NOT_SHARED: mapValueOfType<int>(json, r'FETCH_GOOGLE_SHEET_NOT_SHARED'),
        IMAGE_FILE_NOT_ACCESSIBLE: mapValueOfType<int>(json, r'IMAGE_FILE_NOT_ACCESSIBLE'),
        IMAGE_FILE_NOT_FOUND: mapValueOfType<int>(json, r'IMAGE_FILE_NOT_FOUND'),
        IMAGE_INVALID_FILE: mapValueOfType<int>(json, r'IMAGE_INVALID_FILE'),
        IMAGE_LEVEL_INTERNAL_ERROR: mapValueOfType<int>(json, r'IMAGE_LEVEL_INTERNAL_ERROR'),
        IMAGE_MALFORMED_URL: mapValueOfType<int>(json, r'IMAGE_MALFORMED_URL'),
        LARGE_PRODUCT_COUNT_DECREASE: CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum.fromJson(json[r'LARGE_PRODUCT_COUNT_DECREASE']),
        LINE_LEVEL_INTERNAL_ERROR: mapValueOfType<int>(json, r'LINE_LEVEL_INTERNAL_ERROR'),
      );
    }
    return null;
  }

  static List<CatalogsFeedIngestionErrors> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedIngestionErrors>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedIngestionErrors.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsFeedIngestionErrors> mapFromJson(dynamic json) {
    final map = <String, CatalogsFeedIngestionErrors>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsFeedIngestionErrors.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsFeedIngestionErrors-objects as value to a dart map
  static Map<String, List<CatalogsFeedIngestionErrors>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsFeedIngestionErrors>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsFeedIngestionErrors.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// The product count has decreased by more than 99% compared to the last successful ingestion.
class CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum._(this.value);

  /// The underlying value of this enum member.
  final int value;

  @override
  String toString() => value.toString();

  int toJson() => value;

  static const number1 = CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum._(1);

  /// List of all possible values in this [enum][CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum].
  static const values = <CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum>[
    number1,
  ];

  static CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum? fromJson(dynamic value) => CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer().decode(value);

  static List<CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum] to int,
/// and [decode] dynamic data back to [CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum].
class CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer {
  factory CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer() => _instance ??= const CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer._();

  const CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer._();

  int encode(CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case 1: return CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnum.number1;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer] instance.
  static CatalogsFeedIngestionErrorsLARGE_PRODUCT_COUNT_DECREASEEnumTypeTransformer? _instance;
}


