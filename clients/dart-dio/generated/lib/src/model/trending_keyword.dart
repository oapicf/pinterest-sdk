//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/time_series.dart';
import 'package:openapi/src/model/predicted_time_series.dart';
import 'package:openapi/src/model/trending_keyword_demographics.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trending_keyword.g.dart';

/// TrendingKeyword
///
/// Properties:
/// * [demographics] 
/// * [hasPrediction] - Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
/// * [keyword] - The keyword that is trending.
/// * [pctGrowthMom] - The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
/// * [pctGrowthWow] - The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
/// * [pctGrowthYoy] - The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
/// * [predictedTimeSeries] - A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
/// * [timeSeries] - A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
@BuiltValue()
abstract class TrendingKeyword implements Built<TrendingKeyword, TrendingKeywordBuilder> {
  @BuiltValueField(wireName: r'demographics')
  TrendingKeywordDemographics? get demographics;

  /// Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
  @BuiltValueField(wireName: r'has_prediction')
  bool? get hasPrediction;

  /// The keyword that is trending.
  @BuiltValueField(wireName: r'keyword')
  String? get keyword;

  /// The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  @BuiltValueField(wireName: r'pct_growth_mom')
  int? get pctGrowthMom;

  /// The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  @BuiltValueField(wireName: r'pct_growth_wow')
  int? get pctGrowthWow;

  /// The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  @BuiltValueField(wireName: r'pct_growth_yoy')
  int? get pctGrowthYoy;

  /// A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
  @BuiltValueField(wireName: r'predicted_time_series')
  PredictedTimeSeries? get predictedTimeSeries;

  /// A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
  @BuiltValueField(wireName: r'time_series')
  TimeSeries? get timeSeries;

  TrendingKeyword._();

  factory TrendingKeyword([void updates(TrendingKeywordBuilder b)]) = _$TrendingKeyword;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TrendingKeywordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TrendingKeyword> get serializer => _$TrendingKeywordSerializer();
}

class _$TrendingKeywordSerializer implements PrimitiveSerializer<TrendingKeyword> {
  @override
  final Iterable<Type> types = const [TrendingKeyword, _$TrendingKeyword];

  @override
  final String wireName = r'TrendingKeyword';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TrendingKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.demographics != null) {
      yield r'demographics';
      yield serializers.serialize(
        object.demographics,
        specifiedType: const FullType.nullable(TrendingKeywordDemographics),
      );
    }
    if (object.hasPrediction != null) {
      yield r'has_prediction';
      yield serializers.serialize(
        object.hasPrediction,
        specifiedType: const FullType(bool),
      );
    }
    if (object.keyword != null) {
      yield r'keyword';
      yield serializers.serialize(
        object.keyword,
        specifiedType: const FullType(String),
      );
    }
    if (object.pctGrowthMom != null) {
      yield r'pct_growth_mom';
      yield serializers.serialize(
        object.pctGrowthMom,
        specifiedType: const FullType(int),
      );
    }
    if (object.pctGrowthWow != null) {
      yield r'pct_growth_wow';
      yield serializers.serialize(
        object.pctGrowthWow,
        specifiedType: const FullType(int),
      );
    }
    if (object.pctGrowthYoy != null) {
      yield r'pct_growth_yoy';
      yield serializers.serialize(
        object.pctGrowthYoy,
        specifiedType: const FullType(int),
      );
    }
    if (object.predictedTimeSeries != null) {
      yield r'predicted_time_series';
      yield serializers.serialize(
        object.predictedTimeSeries,
        specifiedType: const FullType(PredictedTimeSeries),
      );
    }
    if (object.timeSeries != null) {
      yield r'time_series';
      yield serializers.serialize(
        object.timeSeries,
        specifiedType: const FullType(TimeSeries),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    TrendingKeyword object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TrendingKeywordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'demographics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrendingKeywordDemographics),
          ) as TrendingKeywordDemographics?;
          if (valueDes == null) continue;
          result.demographics.replace(valueDes);
          break;
        case r'has_prediction':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.hasPrediction = valueDes;
          break;
        case r'keyword':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.keyword = valueDes;
          break;
        case r'pct_growth_mom':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pctGrowthMom = valueDes;
          break;
        case r'pct_growth_wow':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pctGrowthWow = valueDes;
          break;
        case r'pct_growth_yoy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pctGrowthYoy = valueDes;
          break;
        case r'predicted_time_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PredictedTimeSeries),
          ) as PredictedTimeSeries?;
          if (valueDes == null) continue;
          result.predictedTimeSeries = valueDes;
          break;
        case r'time_series':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TimeSeries),
          ) as TimeSeries?;
          if (valueDes == null) continue;
          result.timeSeries = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TrendingKeyword deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TrendingKeywordBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

