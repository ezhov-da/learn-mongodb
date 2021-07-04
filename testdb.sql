use('testdb');
db.sales.drop();
db.sales.insertMany([
    { '_id': 9, 'item': 'abc', 'price': 10, 'quantity': 5, 'date': new Date('2016-02-06T20:20:13Z') },
]);

db.sales.find()

db.events.find()