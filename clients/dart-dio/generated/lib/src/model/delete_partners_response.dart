//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delete_partners_response.g.dart';

/// An object with a list of partners that were deleted.
///
/// Properties:
/// * [deletedPartners] - List of partners whose business partnership have been terminated.
@BuiltValue()
abstract class DeletePartnersResponse implements Built<DeletePartnersResponse, DeletePartnersResponseBuilder> {
  /// List of partners whose business partnership have been terminated.
  @BuiltValueField(wireName: r'deleted_partners')
  BuiltList<String>? get deletedPartners;

  DeletePartnersResponse._();

  factory DeletePartnersResponse([void updates(DeletePartnersResponseBuilder b)]) = _$DeletePartnersResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeletePartnersResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeletePartnersResponse> get serializer => _$DeletePartnersResponseSerializer();
}

class _$DeletePartnersResponseSerializer implements PrimitiveSerializer<DeletePartnersResponse> {
  @override
  final Iterable<Type> types = const [DeletePartnersResponse, _$DeletePartnersResponse];

  @override
  final String wireName = r'DeletePartnersResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeletePartnersResponse object, {
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
    DeletePartnersResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeletePartnersResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'deleted_partners':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  DeletePartnersResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeletePartnersResponseBuilder();
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

