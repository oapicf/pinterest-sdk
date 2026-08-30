//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_group.dart';
import 'package:openapi/src/model/pinterest_lib_batch_item_exception.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_groups_create200_response_items_inner.g.dart';

/// AdGroupsCreate200ResponseItemsInner
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class AdGroupsCreate200ResponseItemsInner implements Built<AdGroupsCreate200ResponseItemsInner, AdGroupsCreate200ResponseItemsInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  AdGroup? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<PinterestLibBatchItemException>? get exceptions;

  AdGroupsCreate200ResponseItemsInner._();

  factory AdGroupsCreate200ResponseItemsInner([void updates(AdGroupsCreate200ResponseItemsInnerBuilder b)]) = _$AdGroupsCreate200ResponseItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupsCreate200ResponseItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupsCreate200ResponseItemsInner> get serializer => _$AdGroupsCreate200ResponseItemsInnerSerializer();
}

class _$AdGroupsCreate200ResponseItemsInnerSerializer implements PrimitiveSerializer<AdGroupsCreate200ResponseItemsInner> {
  @override
  final Iterable<Type> types = const [AdGroupsCreate200ResponseItemsInner, _$AdGroupsCreate200ResponseItemsInner];

  @override
  final String wireName = r'AdGroupsCreate200ResponseItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupsCreate200ResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(AdGroup),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(PinterestLibBatchItemException)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupsCreate200ResponseItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupsCreate200ResponseItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroup),
          ) as AdGroup?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PinterestLibBatchItemException)]),
          ) as BuiltList<PinterestLibBatchItemException>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupsCreate200ResponseItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupsCreate200ResponseItemsInnerBuilder();
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

