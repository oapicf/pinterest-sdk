//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuizPinData {
  /// Returns a new [QuizPinData] instance.
  QuizPinData({
    this.questions = const [],
    this.results = const [],
    this.tieBreakerCustomResult,
    this.tieBreakerType,
  });

  List<QuizPinQuestion> questions;

  List<QuizPinResult> results;

  QuizPinResult? tieBreakerCustomResult;

  /// Quiz ad tie breaker type, default is RANDOM
  QuizPinDataTieBreakerTypeEnum? tieBreakerType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuizPinData &&
    _deepEquality.equals(other.questions, questions) &&
    _deepEquality.equals(other.results, results) &&
    other.tieBreakerCustomResult == tieBreakerCustomResult &&
    other.tieBreakerType == tieBreakerType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (questions.hashCode) +
    (results.hashCode) +
    (tieBreakerCustomResult == null ? 0 : tieBreakerCustomResult!.hashCode) +
    (tieBreakerType == null ? 0 : tieBreakerType!.hashCode);

  @override
  String toString() => 'QuizPinData[questions=$questions, results=$results, tieBreakerCustomResult=$tieBreakerCustomResult, tieBreakerType=$tieBreakerType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'questions'] = this.questions;
      json[r'results'] = this.results;
    if (this.tieBreakerCustomResult != null) {
      json[r'tie_breaker_custom_result'] = this.tieBreakerCustomResult;
    } else {
      json[r'tie_breaker_custom_result'] = null;
    }
    if (this.tieBreakerType != null) {
      json[r'tie_breaker_type'] = this.tieBreakerType;
    } else {
      json[r'tie_breaker_type'] = null;
    }
    return json;
  }

  /// Returns a new [QuizPinData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuizPinData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QuizPinData[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QuizPinData[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QuizPinData(
        questions: QuizPinQuestion.listFromJson(json[r'questions']),
        results: QuizPinResult.listFromJson(json[r'results']),
        tieBreakerCustomResult: QuizPinResult.fromJson(json[r'tie_breaker_custom_result']),
        tieBreakerType: QuizPinDataTieBreakerTypeEnum.fromJson(json[r'tie_breaker_type']),
      );
    }
    return null;
  }

  static List<QuizPinData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuizPinData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuizPinData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuizPinData> mapFromJson(dynamic json) {
    final map = <String, QuizPinData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuizPinData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuizPinData-objects as value to a dart map
  static Map<String, List<QuizPinData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuizPinData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuizPinData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Quiz ad tie breaker type, default is RANDOM
class QuizPinDataTieBreakerTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const QuizPinDataTieBreakerTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RANDOM = QuizPinDataTieBreakerTypeEnum._(r'RANDOM');
  static const CUSTOM = QuizPinDataTieBreakerTypeEnum._(r'CUSTOM');

  /// List of all possible values in this [enum][QuizPinDataTieBreakerTypeEnum].
  static const values = <QuizPinDataTieBreakerTypeEnum>[
    RANDOM,
    CUSTOM,
  ];

  static QuizPinDataTieBreakerTypeEnum? fromJson(dynamic value) => QuizPinDataTieBreakerTypeEnumTypeTransformer().decode(value);

  static List<QuizPinDataTieBreakerTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuizPinDataTieBreakerTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuizPinDataTieBreakerTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [QuizPinDataTieBreakerTypeEnum] to String,
/// and [decode] dynamic data back to [QuizPinDataTieBreakerTypeEnum].
class QuizPinDataTieBreakerTypeEnumTypeTransformer {
  factory QuizPinDataTieBreakerTypeEnumTypeTransformer() => _instance ??= const QuizPinDataTieBreakerTypeEnumTypeTransformer._();

  const QuizPinDataTieBreakerTypeEnumTypeTransformer._();

  String encode(QuizPinDataTieBreakerTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a QuizPinDataTieBreakerTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  QuizPinDataTieBreakerTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RANDOM': return QuizPinDataTieBreakerTypeEnum.RANDOM;
        case r'CUSTOM': return QuizPinDataTieBreakerTypeEnum.CUSTOM;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [QuizPinDataTieBreakerTypeEnumTypeTransformer] instance.
  static QuizPinDataTieBreakerTypeEnumTypeTransformer? _instance;
}


