//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/update_partner_assets_result.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_assets_results_response_array.g.dart';

/// UpdatePartnerAssetsResultsResponseArray
///
/// Properties:
/// * [items] - List of assigned/updated partner asset access.
@BuiltValue()
abstract class UpdatePartnerAssetsResultsResponseArray implements Built<UpdatePartnerAssetsResultsResponseArray, UpdatePartnerAssetsResultsResponseArrayBuilder> {
  /// List of assigned/updated partner asset access.
  @BuiltValueField(wireName: r'items')
  BuiltList<UpdatePartnerAssetsResult>? get items;

  UpdatePartnerAssetsResultsResponseArray._();

  factory UpdatePartnerAssetsResultsResponseArray([void updates(UpdatePartnerAssetsResultsResponseArrayBuilder b)]) = _$UpdatePartnerAssetsResultsResponseArray;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerAssetsResultsResponseArrayBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerAssetsResultsResponseArray> get serializer => _$UpdatePartnerAssetsResultsResponseArraySerializer();
}

class _$UpdatePartnerAssetsResultsResponseArraySerializer implements PrimitiveSerializer<UpdatePartnerAssetsResultsResponseArray> {
  @override
  final Iterable<Type> types = const [UpdatePartnerAssetsResultsResponseArray, _$UpdatePartnerAssetsResultsResponseArray];

  @override
  final String wireName = r'UpdatePartnerAssetsResultsResponseArray';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(UpdatePartnerAssetsResult)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdatePartnerAssetsResultsResponseArray object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerAssetsResultsResponseArrayBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdatePartnerAssetsResult)]),
          ) as BuiltList<UpdatePartnerAssetsResult>?;
          if (valueDes == null) continue;
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
  UpdatePartnerAssetsResultsResponseArray deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerAssetsResultsResponseArrayBuilder();
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

