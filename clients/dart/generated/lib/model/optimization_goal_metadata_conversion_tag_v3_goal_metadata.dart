//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OptimizationGoalMetadataConversionTagV3GoalMetadata {
  /// Returns a new [OptimizationGoalMetadataConversionTagV3GoalMetadata] instance.
  OptimizationGoalMetadataConversionTagV3GoalMetadata({
    this.attributionWindows,
    this.conversionEvent,
    this.conversionTagId,
    this.cpaGoalValueInMicroCurrency,
    this.isRoasOptimized,
    this.learningModeType,
    this.reportingEvent,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows? attributionWindows;

  OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum? conversionEvent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? conversionTagId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cpaGoalValueInMicroCurrency;

  /// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. <br>This parameter is not enabled for all advertisers. <a href=\"https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\">Learn more</a>.
  bool? isRoasOptimized;

  /// Conversion learning model type
  OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum? learningModeType;

  /// Event name for custom or standard events mapped to an oCPM model
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? reportingEvent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OptimizationGoalMetadataConversionTagV3GoalMetadata &&
    other.attributionWindows == attributionWindows &&
    other.conversionEvent == conversionEvent &&
    other.conversionTagId == conversionTagId &&
    other.cpaGoalValueInMicroCurrency == cpaGoalValueInMicroCurrency &&
    other.isRoasOptimized == isRoasOptimized &&
    other.learningModeType == learningModeType &&
    other.reportingEvent == reportingEvent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributionWindows == null ? 0 : attributionWindows!.hashCode) +
    (conversionEvent == null ? 0 : conversionEvent!.hashCode) +
    (conversionTagId == null ? 0 : conversionTagId!.hashCode) +
    (cpaGoalValueInMicroCurrency == null ? 0 : cpaGoalValueInMicroCurrency!.hashCode) +
    (isRoasOptimized == null ? 0 : isRoasOptimized!.hashCode) +
    (learningModeType == null ? 0 : learningModeType!.hashCode) +
    (reportingEvent == null ? 0 : reportingEvent!.hashCode);

  @override
  String toString() => 'OptimizationGoalMetadataConversionTagV3GoalMetadata[attributionWindows=$attributionWindows, conversionEvent=$conversionEvent, conversionTagId=$conversionTagId, cpaGoalValueInMicroCurrency=$cpaGoalValueInMicroCurrency, isRoasOptimized=$isRoasOptimized, learningModeType=$learningModeType, reportingEvent=$reportingEvent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributionWindows != null) {
      json[r'attribution_windows'] = this.attributionWindows;
    } else {
      json[r'attribution_windows'] = null;
    }
    if (this.conversionEvent != null) {
      json[r'conversion_event'] = this.conversionEvent;
    } else {
      json[r'conversion_event'] = null;
    }
    if (this.conversionTagId != null) {
      json[r'conversion_tag_id'] = this.conversionTagId;
    } else {
      json[r'conversion_tag_id'] = null;
    }
    if (this.cpaGoalValueInMicroCurrency != null) {
      json[r'cpa_goal_value_in_micro_currency'] = this.cpaGoalValueInMicroCurrency;
    } else {
      json[r'cpa_goal_value_in_micro_currency'] = null;
    }
    if (this.isRoasOptimized != null) {
      json[r'is_roas_optimized'] = this.isRoasOptimized;
    } else {
      json[r'is_roas_optimized'] = null;
    }
    if (this.learningModeType != null) {
      json[r'learning_mode_type'] = this.learningModeType;
    } else {
      json[r'learning_mode_type'] = null;
    }
    if (this.reportingEvent != null) {
      json[r'reporting_event'] = this.reportingEvent;
    } else {
      json[r'reporting_event'] = null;
    }
    return json;
  }

  /// Returns a new [OptimizationGoalMetadataConversionTagV3GoalMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OptimizationGoalMetadataConversionTagV3GoalMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OptimizationGoalMetadataConversionTagV3GoalMetadata[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OptimizationGoalMetadataConversionTagV3GoalMetadata[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OptimizationGoalMetadataConversionTagV3GoalMetadata(
        attributionWindows: OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.fromJson(json[r'attribution_windows']),
        conversionEvent: OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.fromJson(json[r'conversion_event']),
        conversionTagId: mapValueOfType<String>(json, r'conversion_tag_id'),
        cpaGoalValueInMicroCurrency: mapValueOfType<String>(json, r'cpa_goal_value_in_micro_currency'),
        isRoasOptimized: mapValueOfType<bool>(json, r'is_roas_optimized'),
        learningModeType: OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum.fromJson(json[r'learning_mode_type']),
        reportingEvent: mapValueOfType<String>(json, r'reporting_event'),
      );
    }
    return null;
  }

  static List<OptimizationGoalMetadataConversionTagV3GoalMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataConversionTagV3GoalMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OptimizationGoalMetadataConversionTagV3GoalMetadata> mapFromJson(dynamic json) {
    final map = <String, OptimizationGoalMetadataConversionTagV3GoalMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OptimizationGoalMetadataConversionTagV3GoalMetadata-objects as value to a dart map
  static Map<String, List<OptimizationGoalMetadataConversionTagV3GoalMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OptimizationGoalMetadataConversionTagV3GoalMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OptimizationGoalMetadataConversionTagV3GoalMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum {
  /// Instantiate a new enum with the provided [value].
  const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PAGE_VISIT = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'PAGE_VISIT');
  static const SIGNUP = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'SIGNUP');
  static const CHECKOUT = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'CHECKOUT');
  static const CUSTOM = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'CUSTOM');
  static const VIEW_CATEGORY = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'VIEW_CATEGORY');
  static const SEARCH = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'SEARCH');
  static const ADD_TO_CART = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'ADD_TO_CART');
  static const WATCH_VIDEO = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'WATCH_VIDEO');
  static const LEAD = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'LEAD');
  static const APP_INSTALL = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum._(r'APP_INSTALL');

  /// List of all possible values in this [enum][OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum].
  static const values = <OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum>[
    PAGE_VISIT,
    SIGNUP,
    CHECKOUT,
    CUSTOM,
    VIEW_CATEGORY,
    SEARCH,
    ADD_TO_CART,
    WATCH_VIDEO,
    LEAD,
    APP_INSTALL,
  ];

  static OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum? fromJson(dynamic value) => OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer().decode(value);

  static List<OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum] to String,
/// and [decode] dynamic data back to [OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum].
class OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer {
  factory OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer() => _instance ??= const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer._();

  const OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer._();

  String encode(OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PAGE_VISIT': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.PAGE_VISIT;
        case r'SIGNUP': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.SIGNUP;
        case r'CHECKOUT': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.CHECKOUT;
        case r'CUSTOM': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.CUSTOM;
        case r'VIEW_CATEGORY': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.VIEW_CATEGORY;
        case r'SEARCH': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.SEARCH;
        case r'ADD_TO_CART': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.ADD_TO_CART;
        case r'WATCH_VIDEO': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.WATCH_VIDEO;
        case r'LEAD': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.LEAD;
        case r'APP_INSTALL': return OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnum.APP_INSTALL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer] instance.
  static OptimizationGoalMetadataConversionTagV3GoalMetadataConversionEventEnumTypeTransformer? _instance;
}


/// Conversion learning model type
class OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NOT_ACTIVE = OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum._(r'NOT_ACTIVE');
  static const ACTIVE = OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum._(r'ACTIVE');

  /// List of all possible values in this [enum][OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum].
  static const values = <OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum>[
    NOT_ACTIVE,
    ACTIVE,
  ];

  static OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum? fromJson(dynamic value) => OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer().decode(value);

  static List<OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum] to String,
/// and [decode] dynamic data back to [OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum].
class OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer {
  factory OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer() => _instance ??= const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer._();

  const OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer._();

  String encode(OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NOT_ACTIVE': return OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum.NOT_ACTIVE;
        case r'ACTIVE': return OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnum.ACTIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer] instance.
  static OptimizationGoalMetadataConversionTagV3GoalMetadataLearningModeTypeEnumTypeTransformer? _instance;
}


