//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Budget type. If DAILY, an ad group's daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group `start_time` and `end_time` range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \"CBO_ADGROUP\" is allowed. For WEB_SESSIONS campaigns, only \"LIFETIME\" is allowed. For update, only draft ad groups may update budget type.
class BudgetType {
  /// Instantiate a new enum with the provided [value].
  const BudgetType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const DAILY = BudgetType._(r'DAILY');
  static const LIFETIME = BudgetType._(r'LIFETIME');
  static const CBO_ADGROUP = BudgetType._(r'CBO_ADGROUP');

  /// List of all possible values in this [enum][BudgetType].
  static const values = <BudgetType>[
    DAILY,
    LIFETIME,
    CBO_ADGROUP,
  ];

  static BudgetType? fromJson(dynamic value) => BudgetTypeTypeTransformer().decode(value);

  static List<BudgetType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BudgetType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BudgetType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BudgetType] to String,
/// and [decode] dynamic data back to [BudgetType].
class BudgetTypeTypeTransformer {
  factory BudgetTypeTypeTransformer() => _instance ??= const BudgetTypeTypeTransformer._();

  const BudgetTypeTypeTransformer._();

  String encode(BudgetType data) => data.value;

  /// Decodes a [dynamic value][data] to a BudgetType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BudgetType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'DAILY': return BudgetType.DAILY;
        case r'LIFETIME': return BudgetType.LIFETIME;
        case r'CBO_ADGROUP': return BudgetType.CBO_ADGROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BudgetTypeTypeTransformer] instance.
  static BudgetTypeTypeTransformer? _instance;
}

