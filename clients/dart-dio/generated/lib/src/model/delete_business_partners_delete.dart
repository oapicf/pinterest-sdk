//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/nullable_partner_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_business_partners_delete.g.dart';

/// DeleteBusinessPartnersDelete
///
/// Properties:
/// * [partnerIds] - A list of partner ids to be deleted
/// * [partnerType] 
@BuiltValue()
abstract class DeleteBusinessPartnersDelete implements Built<DeleteBusinessPartnersDelete, DeleteBusinessPartnersDeleteBuilder> {
  /// A list of partner ids to be deleted
  @BuiltValueField(wireName: r'partner_ids')
  BuiltList<String> get partnerIds;

  @BuiltValueField(wireName: r'partner_type')
  NullablePartnerType? get partnerType;
  // enum partnerTypeEnum {  INTERNAL,  EXTERNAL,  ,  };

  DeleteBusinessPartnersDelete._();

  factory DeleteBusinessPartnersDelete([void updates(DeleteBusinessPartnersDeleteBuilder b)]) = _$DeleteBusinessPartnersDelete;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteBusinessPartnersDeleteBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteBusinessPartnersDelete> get serializer => _$DeleteBusinessPartnersDeleteSerializer();
}

class _$DeleteBusinessPartnersDeleteSerializer implements PrimitiveSerializer<DeleteBusinessPartnersDelete> {
  @override
  final Iterable<Type> types = const [DeleteBusinessPartnersDelete, _$DeleteBusinessPartnersDelete];

  @override
  final String wireName = r'DeleteBusinessPartnersDelete';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteBusinessPartnersDelete object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'partner_ids';
    yield serializers.serialize(
      object.partnerIds,
      specifiedType: const FullType(BuiltList, [FullType(String)]),
    );
    if (object.partnerType != null) {
      yield r'partner_type';
      yield serializers.serialize(
        object.partnerType,
        specifiedType: const FullType.nullable(NullablePartnerType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteBusinessPartnersDelete object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteBusinessPartnersDeleteBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'partner_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.partnerIds.replace(valueDes);
          break;
        case r'partner_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullablePartnerType),
          ) as NullablePartnerType?;
          if (valueDes == null) continue;
          result.partnerType = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteBusinessPartnersDelete deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteBusinessPartnersDeleteBuilder();
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

