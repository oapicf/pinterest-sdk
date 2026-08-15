//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateMMMReportRequest {
  /// Returns a new [CreateMMMReportRequest] instance.
  CreateMMMReportRequest({
    this.countries = const [],
    this.columns = const [],
    required this.endDate,
    required this.granularity,
    required this.level,
    required this.reportName,
    required this.startDate,
    this.targetingTypes = const [],
  });

  /// A List of countries for filtering
  List<TargetingAdvertiserCountry> countries;

  /// Metric and entity columns
  List<MMMReportingColumn> columns;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  String endDate;

  /// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  CreateMMMReportRequestGranularityEnum granularity;

  /// Level of the report
  CreateMMMReportRequestLevelEnum level;

  /// Name of the Marketing Mix Modeling (MMM) report
  String reportName;

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  String startDate;

  /// List of targeting types
  List<MMMReportingTargetingType> targetingTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateMMMReportRequest &&
    _deepEquality.equals(other.countries, countries) &&
    _deepEquality.equals(other.columns, columns) &&
    other.endDate == endDate &&
    other.granularity == granularity &&
    other.level == level &&
    other.reportName == reportName &&
    other.startDate == startDate &&
    _deepEquality.equals(other.targetingTypes, targetingTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (countries.hashCode) +
    (columns.hashCode) +
    (endDate.hashCode) +
    (granularity.hashCode) +
    (level.hashCode) +
    (reportName.hashCode) +
    (startDate.hashCode) +
    (targetingTypes.hashCode);

  @override
  String toString() => 'CreateMMMReportRequest[countries=$countries, columns=$columns, endDate=$endDate, granularity=$granularity, level=$level, reportName=$reportName, startDate=$startDate, targetingTypes=$targetingTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'countries'] = this.countries;
      json[r'columns'] = this.columns;
      json[r'end_date'] = this.endDate;
      json[r'granularity'] = this.granularity;
      json[r'level'] = this.level;
      json[r'report_name'] = this.reportName;
      json[r'start_date'] = this.startDate;
      json[r'targeting_types'] = this.targetingTypes;
    return json;
  }

  /// Returns a new [CreateMMMReportRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateMMMReportRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateMMMReportRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateMMMReportRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateMMMReportRequest(
        countries: TargetingAdvertiserCountry.listFromJson(json[r'countries']),
        columns: MMMReportingColumn.listFromJson(json[r'columns']),
        endDate: mapValueOfType<String>(json, r'end_date')!,
        granularity: CreateMMMReportRequestGranularityEnum.fromJson(json[r'granularity'])!,
        level: CreateMMMReportRequestLevelEnum.fromJson(json[r'level'])!,
        reportName: mapValueOfType<String>(json, r'report_name')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        targetingTypes: MMMReportingTargetingType.listFromJson(json[r'targeting_types']),
      );
    }
    return null;
  }

  static List<CreateMMMReportRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMMMReportRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMMMReportRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateMMMReportRequest> mapFromJson(dynamic json) {
    final map = <String, CreateMMMReportRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateMMMReportRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateMMMReportRequest-objects as value to a dart map
  static Map<String, List<CreateMMMReportRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateMMMReportRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateMMMReportRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'columns',
    'end_date',
    'granularity',
    'level',
    'report_name',
    'start_date',
    'targeting_types',
  };
}

/// DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
class CreateMMMReportRequestGranularityEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateMMMReportRequestGranularityEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DAY = CreateMMMReportRequestGranularityEnum._(r'DAY');
  static const WEEK = CreateMMMReportRequestGranularityEnum._(r'WEEK');

  /// List of all possible values in this [enum][CreateMMMReportRequestGranularityEnum].
  static const values = <CreateMMMReportRequestGranularityEnum>[
    DAY,
    WEEK,
  ];

  static CreateMMMReportRequestGranularityEnum? fromJson(dynamic value) => CreateMMMReportRequestGranularityEnumTypeTransformer().decode(value);

  static List<CreateMMMReportRequestGranularityEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMMMReportRequestGranularityEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMMMReportRequestGranularityEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateMMMReportRequestGranularityEnum] to String,
/// and [decode] dynamic data back to [CreateMMMReportRequestGranularityEnum].
class CreateMMMReportRequestGranularityEnumTypeTransformer {
  factory CreateMMMReportRequestGranularityEnumTypeTransformer() => _instance ??= const CreateMMMReportRequestGranularityEnumTypeTransformer._();

  const CreateMMMReportRequestGranularityEnumTypeTransformer._();

  String encode(CreateMMMReportRequestGranularityEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateMMMReportRequestGranularityEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateMMMReportRequestGranularityEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DAY': return CreateMMMReportRequestGranularityEnum.DAY;
        case r'WEEK': return CreateMMMReportRequestGranularityEnum.WEEK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateMMMReportRequestGranularityEnumTypeTransformer] instance.
  static CreateMMMReportRequestGranularityEnumTypeTransformer? _instance;
}


/// Level of the report
class CreateMMMReportRequestLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const CreateMMMReportRequestLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CAMPAIGN_TARGETING = CreateMMMReportRequestLevelEnum._(r'CAMPAIGN_TARGETING');
  static const AD_GROUP_TARGETING = CreateMMMReportRequestLevelEnum._(r'AD_GROUP_TARGETING');

  /// List of all possible values in this [enum][CreateMMMReportRequestLevelEnum].
  static const values = <CreateMMMReportRequestLevelEnum>[
    CAMPAIGN_TARGETING,
    AD_GROUP_TARGETING,
  ];

  static CreateMMMReportRequestLevelEnum? fromJson(dynamic value) => CreateMMMReportRequestLevelEnumTypeTransformer().decode(value);

  static List<CreateMMMReportRequestLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateMMMReportRequestLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateMMMReportRequestLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreateMMMReportRequestLevelEnum] to String,
/// and [decode] dynamic data back to [CreateMMMReportRequestLevelEnum].
class CreateMMMReportRequestLevelEnumTypeTransformer {
  factory CreateMMMReportRequestLevelEnumTypeTransformer() => _instance ??= const CreateMMMReportRequestLevelEnumTypeTransformer._();

  const CreateMMMReportRequestLevelEnumTypeTransformer._();

  String encode(CreateMMMReportRequestLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CreateMMMReportRequestLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreateMMMReportRequestLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN_TARGETING': return CreateMMMReportRequestLevelEnum.CAMPAIGN_TARGETING;
        case r'AD_GROUP_TARGETING': return CreateMMMReportRequestLevelEnum.AD_GROUP_TARGETING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreateMMMReportRequestLevelEnumTypeTransformer] instance.
  static CreateMMMReportRequestLevelEnumTypeTransformer? _instance;
}


