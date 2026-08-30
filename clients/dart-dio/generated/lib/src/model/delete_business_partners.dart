//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_business_partners.g.dart';

/// DeleteBusinessPartners
///
/// Properties:
/// * [deletedPartners] 
@BuiltValue()
abstract class DeleteBusinessPartners implements Built<DeleteBusinessPartners, DeleteBusinessPartnersBuilder> {
  @BuiltValueField(wireName: r'deleted_partners')
  BuiltList<String>? get deletedPartners;

  DeleteBusinessPartners._();

  factory DeleteBusinessPartners([void updates(DeleteBusinessPartnersBuilder b)]) = _$DeleteBusinessPartners;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeleteBusinessPartnersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeleteBusinessPartners> get serializer => _$DeleteBusinessPartnersSerializer();
}

class _$DeleteBusinessPartnersSerializer implements PrimitiveSerializer<DeleteBusinessPartners> {
  @override
  final Iterable<Type> types = const [DeleteBusinessPartners, _$DeleteBusinessPartners];

  @override
  final String wireName = r'DeleteBusinessPartners';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeleteBusinessPartners object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deletedPartners != null) {
      yield r'deleted_partners';
      yield serializers.serialize(
        object.deletedPartners,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeleteBusinessPartners object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeleteBusinessPartnersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_partners':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.deletedPartners.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  DeleteBusinessPartners deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeleteBusinessPartnersBuilder();
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

