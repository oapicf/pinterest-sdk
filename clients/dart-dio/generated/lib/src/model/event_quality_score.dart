//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/quality_components.dart';
import 'package:openapi/src/model/source_platform_options.dart';
import 'package:openapi/src/model/lookback_period_options.dart';
import 'package:openapi/src/model/ingestion_source_options.dart';
import 'package:openapi/src/model/overall_status_options.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'event_quality_score.g.dart';

/// Schema for GET Conversion EQS response.
///
/// Properties:
/// * [ingestionSource] 
/// * [lookbackPeriod] 
/// * [overallStatus] 
/// * [qualityComponents] 
/// * [sourcePlatform] 
@BuiltValue()
abstract class EventQualityScore implements Built<EventQualityScore, EventQualityScoreBuilder> {
  @BuiltValueField(wireName: r'ingestion_source')
  IngestionSourceOptions get ingestionSource;
  // enum ingestionSourceEnum {  TAG,  MMP,  FILE_UPLOAD,  CONVERSIONS_API,  NATIVE,  };

  @BuiltValueField(wireName: r'lookback_period')
  LookbackPeriodOptions get lookbackPeriod;
  // enum lookbackPeriodEnum {  1d,  14d,  };

  @BuiltValueField(wireName: r'overall_status')
  OverallStatusOptions get overallStatus;
  // enum overallStatusEnum {  NEEDS_IMPROVEMENT,  FAIR,  GOOD,  };

  @BuiltValueField(wireName: r'quality_components')
  QualityComponents get qualityComponents;

  @BuiltValueField(wireName: r'source_platform')
  SourcePlatformOptions get sourcePlatform;
  // enum sourcePlatformEnum {  WEB,  MOBILE,  MOBILE_ANDROID,  MOBILE_IOS,  OFFLINE,  PINTEREST_WEB,  PINTEREST_ANDROID,  PINTEREST_IOS,  POINT_OF_SALE,  };

  EventQualityScore._();

  factory EventQualityScore([void updates(EventQualityScoreBuilder b)]) = _$EventQualityScore;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EventQualityScoreBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EventQualityScore> get serializer => _$EventQualityScoreSerializer();
}

class _$EventQualityScoreSerializer implements PrimitiveSerializer<EventQualityScore> {
  @override
  final Iterable<Type> types = const [EventQualityScore, _$EventQualityScore];

  @override
  final String wireName = r'EventQualityScore';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EventQualityScore object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ingestion_source';
    yield serializers.serialize(
      object.ingestionSource,
      specifiedType: const FullType(IngestionSourceOptions),
    );
    yield r'lookback_period';
    yield serializers.serialize(
      object.lookbackPeriod,
      specifiedType: const FullType(LookbackPeriodOptions),
    );
    yield r'overall_status';
    yield serializers.serialize(
      object.overallStatus,
      specifiedType: const FullType(OverallStatusOptions),
    );
    yield r'quality_components';
    yield serializers.serialize(
      object.qualityComponents,
      specifiedType: const FullType(QualityComponents),
    );
    yield r'source_platform';
    yield serializers.serialize(
      object.sourcePlatform,
      specifiedType: const FullType(SourcePlatformOptions),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EventQualityScore object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EventQualityScoreBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ingestion_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(IngestionSourceOptions),
          ) as IngestionSourceOptions;
          result.ingestionSource = valueDes;
          break;
        case r'lookback_period':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LookbackPeriodOptions),
          ) as LookbackPeriodOptions;
          result.lookbackPeriod = valueDes;
          break;
        case r'overall_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OverallStatusOptions),
          ) as OverallStatusOptions;
          result.overallStatus = valueDes;
          break;
        case r'quality_components':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(QualityComponents),
          ) as QualityComponents;
          result.qualityComponents.replace(valueDes);
          break;
        case r'source_platform':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SourcePlatformOptions),
          ) as SourcePlatformOptions;
          result.sourcePlatform = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EventQualityScore deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EventQualityScoreBuilder();
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

