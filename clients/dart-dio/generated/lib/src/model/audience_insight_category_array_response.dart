//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/audience_insight_category_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'audience_insight_category_array_response.g.dart';

/// AudienceInsightCategoryArrayResponse
///
/// Properties:
/// * [items] 
@Deprecated('AudienceInsightCategoryArrayResponse has been deprecated')
@BuiltValue()
abstract class AudienceInsightCategoryArrayResponse implements Built<AudienceInsightCategoryArrayResponse, AudienceInsightCategoryArrayResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AudienceInsightCategoryCommon>? get items;

  AudienceInsightCategoryArrayResponse._();

  factory AudienceInsightCategoryArrayResponse([void updates(AudienceInsightCategoryArrayResponseBuilder b)]) = _$AudienceInsightCategoryArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AudienceInsightCategoryArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AudienceInsightCategoryArrayResponse> get serializer => _$AudienceInsightCategoryArrayResponseSerializer();
}

class _$AudienceInsightCategoryArrayResponseSerializer implements PrimitiveSerializer<AudienceInsightCategoryArrayResponse> {
  @override
  final Iterable<Type> types = const [AudienceInsightCategoryArrayResponse, _$AudienceInsightCategoryArrayResponse];

  @override
  final String wireName = r'AudienceInsightCategoryArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AudienceInsightCategoryArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AudienceInsightCategoryCommon)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AudienceInsightCategoryArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AudienceInsightCategoryArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AudienceInsightCategoryCommon)]),
          ) as BuiltList<AudienceInsightCategoryCommon>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AudienceInsightCategoryArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AudienceInsightCategoryArrayResponseBuilder();
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

