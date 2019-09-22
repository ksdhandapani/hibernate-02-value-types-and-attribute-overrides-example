# hibernate-02-value-types-and-attribute-overrides-example

Postman request details for saving an employee with home and office address.

**Method :** POST
**Url :** http://localhost:8080/hibernate-02-value-types/api/employee
**Request Body :**

`{
	"employeeId": 0,
	"employeeName":"Chandru R",
	"department":"Development",
	"gender": "Male",
	"homeAddress": {
		"streetName":"Sankara Madam Street",
		"city":"Emakandanur",
		"state": "Tamil Nadu",
		"country": "India"
	},
	"officeAddress": {
		"streetName":"Sanjeevi Street",
		"city":"Chennai",
		"state": "Tamil Nadu",
		"country": "India"
		
	}
}`

**Sample Response :**

`{
    "data": {
        "employeeId": 1,
        "employeeName": "Chandru R",
        "gender": "Male",
        "department": "Development",
        "homeAddress": {
            "streetName": "Sakkili Theru",
            "city": "Emakandanur",
            "state": "Tamil Nadu",
            "country": "India"
        },
        "officeAddress": {
            "streetName": "Sanjeevi Street",
            "city": "Chennai",
            "state": "Tamil Nadu",
            "country": "India"
        }
    },
    "message": "Employee saved successfully",
    "exception": false,
    "success": true
}`

