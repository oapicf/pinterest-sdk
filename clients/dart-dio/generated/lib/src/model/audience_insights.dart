//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/audience_insight_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience_category.dart';
import 'package:openapi/src/model/audience_demographics.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_insights.g.dart';

/// Audience interests and demographics.
///
/// Properties:
/// * [categories] - Category interest distribution
/// * [date] - Generation date
/// * [demographics] 
/// * [size] - Population count.
/// * [sizeIsUpperBound] - Indicates whether the audience size has been rounded up to the next highest upper boundary.
/// * [type] 
@BuiltValue()
abstract class AudienceInsights implements Built<AudienceInsights, AudienceInsightsBuilder> {
  /// Category interest distribution
  @BuiltValueField(wireName: r'categories')
  BuiltList<AudienceCategory>? get categories;

  /// Generation date
  @BuiltValueField(wireName: r'date')
  String? get date;

  @BuiltValueField(wireName: r'demographics')
  AudienceDemographics? get demographics;

  /// Population count.
  @BuiltValueField(wireName: r'size')
  int? get size;

  /// Indicates whether the audience size has been rounded up to the next highest upper boundary.
  @BuiltValueField(wireName: r'size_is_upper_bound')
  bool? get sizeIsUpperBound;

  @BuiltValueField(wireName: r'type')
  AudienceInsightType? get type;
  // enum typeEnum {  YOUR_TOTAL_AUDIENCE,  YOUR_ENGAGED_AUDIENCE,  PINTEREST_TOTAL_AUDIENCE,  };

  AudienceInsights._();

  factory AudienceInsights([void updates(AudienceInsightsBuilder b)]) = _$AudienceInsights;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceInsightsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceInsights> get serializer => _$AudienceInsightsSerializer();
}

class _$AudienceInsightsSerializer implements PrimitiveSerializer<AudienceInsights> {
  @override
  final Iterable<Type> types = const [AudienceInsights, _$AudienceInsights];

  @override
  final String wireName = r'AudienceInsights';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceInsights object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.categories != null) {
      yield r'categories';
      yield serializers.serialize(
        object.categories,
        specifiedType: const FullType(BuiltList, [FullType(AudienceCategory)]),
      );
    }
    if (object.date != null) {
      yield r'date';
      yield serializers.serialize(
        object.date,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.demographics != null) {
      yield r'demographics';
      yield serializers.serialize(
        object.demographics,
        specifiedType: const FullType(AudienceDemographics),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType(int),
      );
    }
    if (object.sizeIsUpperBound != null) {
      yield r'size_is_upper_bound';
      yield serializers.serialize(
        object.sizeIsUpperBound,
        specifiedType: const FullType(bool),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(AudienceInsightType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceInsights object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceInsightsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'categories':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AudienceCategory)]),
          ) as BuiltList<AudienceCategory>?;
          if (valueDes == null) continue;
          result.categories.replace(valueDes);
          break;
        case r'date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.date = valueDes;
          break;
        case r'demographics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AudienceDemographics),
          ) as AudienceDemographics?;
          if (valueDes == null) continue;
          result.demographics.replace(valueDes);
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'size_is_upper_bound':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.sizeIsUpperBound = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AudienceInsightType),
          ) as AudienceInsightType?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceInsights deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceInsightsBuilder();
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

