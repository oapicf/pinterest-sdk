//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_group_array_response_element.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_array_response.g.dart';

/// AdGroupArrayResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdGroupArrayResponse implements Built<AdGroupArrayResponse, AdGroupArrayResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdGroupArrayResponseElement>? get items;

  AdGroupArrayResponse._();

  factory AdGroupArrayResponse([void updates(AdGroupArrayResponseBuilder b)]) = _$AdGroupArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupArrayResponse> get serializer => _$AdGroupArrayResponseSerializer();
}

class _$AdGroupArrayResponseSerializer implements PrimitiveSerializer<AdGroupArrayResponse> {
  @override
  final Iterable<Type> types = const [AdGroupArrayResponse, _$AdGroupArrayResponse];

  @override
  final String wireName = r'AdGroupArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupArrayResponseElement)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdGroupArrayResponseElement)]),
          ) as BuiltList<AdGroupArrayResponseElement>;
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
  AdGroupArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupArrayResponseBuilder();
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

