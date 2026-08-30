//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ad_groups_create200_response_items_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_groups_create200_response.g.dart';

/// AdGroupsCreate200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdGroupsCreate200Response implements Built<AdGroupsCreate200Response, AdGroupsCreate200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdGroupsCreate200ResponseItemsInner> get items;

  AdGroupsCreate200Response._();

  factory AdGroupsCreate200Response([void updates(AdGroupsCreate200ResponseBuilder b)]) = _$AdGroupsCreate200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupsCreate200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupsCreate200Response> get serializer => _$AdGroupsCreate200ResponseSerializer();
}

class _$AdGroupsCreate200ResponseSerializer implements PrimitiveSerializer<AdGroupsCreate200Response> {
  @override
  final Iterable<Type> types = const [AdGroupsCreate200Response, _$AdGroupsCreate200Response];

  @override
  final String wireName = r'AdGroupsCreate200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdGroupsCreate200ResponseItemsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupsCreate200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdGroupsCreate200ResponseItemsInner)]),
          ) as BuiltList<AdGroupsCreate200ResponseItemsInner>;
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
  AdGroupsCreate200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupsCreate200ResponseBuilder();
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

