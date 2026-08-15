//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_access_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'update_partner_results_response_array_items_inner.g.dart';

/// UpdatePartnerResultsResponseArrayItemsInner
///
/// Properties:
/// * [exception] 
/// * [memberOrPartnerId] 
@BuiltValue()
abstract class UpdatePartnerResultsResponseArrayItemsInner implements Built<UpdatePartnerResultsResponseArrayItemsInner, UpdatePartnerResultsResponseArrayItemsInnerBuilder> {
  @BuiltValueField(wireName: r'exception')
  BusinessAccessError? get exception;

  @BuiltValueField(wireName: r'member_or_partner_id')
  String? get memberOrPartnerId;

  UpdatePartnerResultsResponseArrayItemsInner._();

  factory UpdatePartnerResultsResponseArrayItemsInner([void updates(UpdatePartnerResultsResponseArrayItemsInnerBuilder b)]) = _$UpdatePartnerResultsResponseArrayItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(UpdatePartnerResultsResponseArrayItemsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<UpdatePartnerResultsResponseArrayItemsInner> get serializer => _$UpdatePartnerResultsResponseArrayItemsInnerSerializer();
}

class _$UpdatePartnerResultsResponseArrayItemsInnerSerializer implements PrimitiveSerializer<UpdatePartnerResultsResponseArrayItemsInner> {
  @override
  final Iterable<Type> types = const [UpdatePartnerResultsResponseArrayItemsInner, _$UpdatePartnerResultsResponseArrayItemsInner];

  @override
  final String wireName = r'UpdatePartnerResultsResponseArrayItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    UpdatePartnerResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.exception != null) {
      yield r'exception';
      yield serializers.serialize(
        object.exception,
        specifiedType: const FullType.nullable(BusinessAccessError),
      );
    }
    if (object.memberOrPartnerId != null) {
      yield r'member_or_partner_id';
      yield serializers.serialize(
        object.memberOrPartnerId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    UpdatePartnerResultsResponseArrayItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required UpdatePartnerResultsResponseArrayItemsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'exception':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BusinessAccessError),
          ) as BusinessAccessError?;
          if (valueDes == null) continue;
          result.exception.replace(valueDes);
          break;
        case r'member_or_partner_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.memberOrPartnerId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  UpdatePartnerResultsResponseArrayItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = UpdatePartnerResultsResponseArrayItemsInnerBuilder();
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

