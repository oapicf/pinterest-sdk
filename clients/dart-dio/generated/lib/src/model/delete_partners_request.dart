//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/business_role_check_mode.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partners_request.g.dart';

/// DeletePartnersRequest
///
/// Properties:
/// * [partnerIds] 
/// * [partnerType] 
@BuiltValue()
abstract class DeletePartnersRequest implements Built<DeletePartnersRequest, DeletePartnersRequestBuilder> {
  @BuiltValueField(wireName: r'partner_ids')
  BuiltList<String> get partnerIds;

  @BuiltValueField(wireName: r'partner_type')
  String? get partnerType;

  DeletePartnersRequest._();

  factory DeletePartnersRequest([void updates(DeletePartnersRequestBuilder b)]) = _$DeletePartnersRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnersRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnersRequest> get serializer => _$DeletePartnersRequestSerializer();
}

class _$DeletePartnersRequestSerializer implements PrimitiveSerializer<DeletePartnersRequest> {
  @override
  final Iterable<Type> types = const [DeletePartnersRequest, _$DeletePartnersRequest];

  @override
  final String wireName = r'DeletePartnersRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnersRequest object, {
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
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeletePartnersRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnersRequestBuilder result,
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
            specifiedType: const FullType.nullable(String),
          ) as String?;
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
  DeletePartnersRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnersRequestBuilder();
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

