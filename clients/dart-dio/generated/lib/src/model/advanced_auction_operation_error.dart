//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advanced_auction_operation_error.g.dart';

/// Error which occurred when applying a bid options operation to a specific item.
///
/// Properties:
/// * [code] - The error code for the item bid option operation validation error
/// * [message] - Message describing the item bid option operation validation error
@BuiltValue()
abstract class AdvancedAuctionOperationError implements Built<AdvancedAuctionOperationError, AdvancedAuctionOperationErrorBuilder> {
  /// The error code for the item bid option operation validation error
  @BuiltValueField(wireName: r'code')
  int? get code;

  /// Message describing the item bid option operation validation error
  @BuiltValueField(wireName: r'message')
  String? get message;

  AdvancedAuctionOperationError._();

  factory AdvancedAuctionOperationError([void updates(AdvancedAuctionOperationErrorBuilder b)]) = _$AdvancedAuctionOperationError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvancedAuctionOperationErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvancedAuctionOperationError> get serializer => _$AdvancedAuctionOperationErrorSerializer();
}

class _$AdvancedAuctionOperationErrorSerializer implements PrimitiveSerializer<AdvancedAuctionOperationError> {
  @override
  final Iterable<Type> types = const [AdvancedAuctionOperationError, _$AdvancedAuctionOperationError];

  @override
  final String wireName = r'AdvancedAuctionOperationError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvancedAuctionOperationError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.code != null) {
      yield r'code';
      yield serializers.serialize(
        object.code,
        specifiedType: const FullType(int),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvancedAuctionOperationError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvancedAuctionOperationErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.code = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvancedAuctionOperationError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvancedAuctionOperationErrorBuilder();
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

